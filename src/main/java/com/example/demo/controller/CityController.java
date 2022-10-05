/**  
* @Title: CityController.java
* @Package com.example.demo.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author wjk
* @date 2018年5月10日
* @version V1.0  
*/

package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

/**
* @ClassName: CityController
* @Description: CityController
* @author wjk
* @date 2018年5月10日
*
*/
@RequestMapping("/city")
@RestController
public class CityController {
@Resource 
private  CityService cityService;
/**
 * 
    * @Title: insertValus
    * @Description: 插入数据
    * @param     参数
    * @return void    返回类型
    * @throws
    * @author wjk
 */
@GetMapping("/insertValues")
public void insertValus() {
    City city =  new  City();
    city.setCityCode("380000");
    city.setCityName("浙江");
    city.setId(4);
    cityService.insertValues(city);
}

/**
 * 
    * @Title: listCity
    * @Description: 查询所有的记录
    * @param @return    参数
    * @return List<City>    返回类型
    * @throws
    * @author wjk
 */
@GetMapping("/list")
public List<City> listCity(  ) {
    return  cityService.listCity( new RowBounds(0, 5) );
}

@GetMapping(value = "/list/{id}", 
produces = { "application/json" })
public ResponseEntity<City> getUserById(@PathVariable("id") Integer id) {
		
	ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	
    ResponseEntity.notFound().build();

	return ResponseEntity.ok(cityService.selectByPrimaryKey(id));
}

@GetMapping("/listLike/{code}")
public List<City> listLikeCity( @PathVariable("code") String code )  {
    return  cityService.listLikeCity(code+"%");
}

/**
 * 
    * @Title: selectByPrimaryKey
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @return    参数
    * @return City    返回类型
    * @throws
 */
@RequestMapping("getCityById")
public City selectByPrimaryKey() {
    return  cityService.selectByPrimaryKey(1);
}
}
