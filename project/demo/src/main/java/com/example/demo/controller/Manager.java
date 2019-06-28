package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
//import org.json.JSONArray;

//import org.json.JSONObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RangeBaseParameter;

import com.example.demo.model.Seq;
import com.example.demo.model.TextBaseParameter;
import com.example.demo.model.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;
import com.example.util.JSONUtil;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/managerCtrl")
public class Manager {
	@Autowired
	UserService userService;

	@Autowired
	TestService testService;
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/findManagerList", headers = {
	 * "content-type=application/json" }, consumes =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method =
	 * RequestMethod.POST) public String findmanager() {
	 * 
	 * System.out.println("Hello"); JSONArray array = new JSONArray(); JSONObject
	 * obj = new JSONObject();
	 * 
	 * List<User> user = userService.listofemployees(); for (User us : user) { try {
	 * obj.put("Id", us.getUser_id()); obj.put("F Name", us.getFirst_name());
	 * obj.put("L Name", us.getLast_name()); obj.put("Mobile", us.getMobileno());
	 * obj.put("Email", us.getEmail()); array.put(obj); } catch (JSONException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * } return array.toString();
	 * 
	 * }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/insertIntoUser", headers = {
	 * "content-type=application/json" }, consumes =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method =
	 * RequestMethod.POST) public ResponseEntity<User> insertIntoUser(@RequestBody
	 * User user) throws Exception {
	 * 
	 * if (user == null) { System.out.println("null object is recived..!");
	 * 
	 * } else { System.out.println("object is recived..!"); Seq seq =
	 * userService.findSquenceByClass(User.class.getSimpleName()); Integer count =
	 * seq.getCount() + Integer.valueOf(1); seq.setCount(count);
	 * user.setUser_id(seq.getSeqName() + "-" + count.toString());
	 * System.out.println("User id--" + user.getUser_id());
	 * userService.addPerson(user); userService.UpdateSeq(seq);
	 * 
	 * } return new ResponseEntity<User>(user, HttpStatus.OK); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/deleteUser", headers = {
	 * "content-type=application/json" }, consumes =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method =
	 * RequestMethod.POST) public String deleteUser(@QueryParam("userId") String
	 * userId) throws Exception { User user = userService.findUserById(userId);
	 * userService.deleteUser(user);
	 * 
	 * return "success"; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/updateUser", headers = {
	 * "content-type=application/json" }, consumes =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method =
	 * RequestMethod.POST) public ResponseEntity<User> updateUser(@RequestBody User
	 * user) throws Exception {
	 * 
	 * if (user == null) { System.out.println("null object is recived..!");
	 * 
	 * } else { System.out.println("object is recived..!");
	 * userService.UpdateUser(user); } return new ResponseEntity<User>(user,
	 * HttpStatus.OK); }
	 * 
	 * // find Range Base Parameter
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/findRangeBaseList", method = RequestMethod.GET)
	 * public String findRangeBase(@QueryParam("requestJSON") String requestJSON) {
	 * System.out.println(requestJSON); Map<String, Object> map =
	 * JSONUtil.getModel(requestJSON);
	 * 
	 * return null;
	 * 
	 * }
	 * 
	 * // find Range Base Parameter ID wise
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/findRangeListById", headers = {
	 * "content-type=application/json" }, consumes =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method =
	 * RequestMethod.POST) public String findRangeList(@QueryParam("propertyId")
	 * String propertyId) {
	 * 
	 * List<RangeBaseParameter> rangeList = testService.findRangeList(propertyId);
	 * 
	 * if (rangeList.size() > 0) { return
	 * testService.findJsonArrayForVendor(rangeList).toString(); } return
	 * "data not found"; }
	 * 
	 * // find Text Base Parameter
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/findTextBaseList", method = RequestMethod.POST)
	 * public String findTextBase() {
	 * 
	 * System.out.println("Hello"); JSONArray array1 = new JSONArray(); JSONObject
	 * obj = new JSONObject();
	 * 
	 * List<TextBaseParameter> textBase = testService.listoftextbase(); for
	 * (TextBaseParameter us : textBase) { try {
	 * 
	 * obj.put("Property", us.getMaterialId()); obj.put("Value",
	 * us.getMaterialName());
	 * 
	 * array1.put(obj); } catch (JSONException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * } return array1.toString();
	 * 
	 * }
	 */
	/*
	 * //Range Base Pararameter Excuted Code
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/findRangeBaseList",method = RequestMethod.GET) public
	 * ResponseEntity<List<RangeBaseParameter>> findRangeBase() {
	 * 
	 * List<RangeBaseParameter> range= testService.listofrangebase();
	 * 
	 * if(range.isEmpty()) {
	 * 
	 * 
	 * return new ResponseEntity(HttpStatus.NO_CONTENT); } return new
	 * ResponseEntity<List<RangeBaseParameter>>(range,HttpStatus.OK); }
	 */

	@ResponseBody
	@RequestMapping(value = "/data",method = RequestMethod.GET)
	public String dataView() throws Exception {

		System.out.println("Hello");
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		

		List<TextBaseParameter> textBase = testService.listoftextbase();
		//List<RangeBaseParameter> rangeBase = testService.listofrangebase();
		for (TextBaseParameter us : textBase) {
			try {
				
				JSONObject obj1 = new JSONObject();
				obj1.put("MaterialId", us.getMaterialId());
				obj1.put("Material Name", us.getMaterialName());

				array.put(obj1);

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		List<RangeBaseParameter> rangeBase = testService.listofrangebase();
				for (RangeBaseParameter us : rangeBase) {
					try {
						
						JSONObject obj2 = new JSONObject();
						obj2.put("property", us.getPropertyName());
						obj2.put("value", us.getValue());

						array.put(obj2);

					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				return array.toString();
		
	}

}