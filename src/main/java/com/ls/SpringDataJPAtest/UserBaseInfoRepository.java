package com.ls.SpringDataJPAtest;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.ls.entity.UserBaseInfo;
//默认情况下Spring Data JPA 方法都是使用了事务的	
//	一般情况继承Repository就行，CRUDRepository直接实现了所有基本方法，但是不安全
public interface UserBaseInfoRepository extends Repository<UserBaseInfo, Integer>{
	//第一种方式，方法名只要按照规则JPA规则写就行
	public UserBaseInfo findByUserId(Integer userId);
	//第二种方式，使用@Query注解，方法名可以自取
	@Query("SELECT * FROM UserBaseInfo WHERE account = ?1 AND passwd = ?2")
	public UserBaseInfo findByAcAndPwd1(String account,String passwd);
	//第二种方式扩展，@Query支持命名参数
	@Query("SELECT * FROM UserBaseInfo WHERE account = :accountXX AND passwd = ?1")
	public UserBaseInfo findByAcAndPwd2(@Param("accountXX")String account,String passwd);
	
	//如果要进行增删改，则必须加上@Modifying注解，该注解将查询标识改为修改标识
	@Modifying
	@Query("UPDATE UserBaseInfo set type = ?1 WHERE account = ?2")
	public int updateType(Integer type,String account);
	
	//Spring Data JPA支持分页及排序
//    public Page<Book> findBookNoCriteria(Integer page,Integer size) {  
//        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "id");  
//        return bookRepository.findAll(pageable);  
	//从controller层接受请求到后台分页流程参考：https://www.2cto.com/kf/201605/506505.html
}
