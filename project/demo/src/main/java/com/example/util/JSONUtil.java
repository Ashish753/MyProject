package com.example.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSONUtil {
	private static final String TEXT_PARAMS = "TEXT_PARAMS";
	private static final String RANGE_PARAMS = "RANGE_PARAMS";

	/*
	 * public static Map<String, Object> getModel(String requestJSON) { JSONObject
	 * json = new JSONObject(requestJSON); Map<String, Object> map = new
	 * HashMap<String, Object>(); if (!json.isNull(TEXT_PARAMS)) {
	 * map.put(TEXT_PARAMS, getTextModel(json.optJSONArray(TEXT_PARAMS))); }
	 * 
	 * if (!json.isNull(RANGE_PARAMS)) { map.put(RANGE_PARAMS,
	 * getRangeModel(json.optJSONArray(RANGE_PARAMS))); } return map; }
	 */

	/*
	 * private static List<TextModel> getTextModel(JSONArray textParams) { if
	 * (textParams != null && textParams.length() > 0) { List<TextModel> list = new
	 * ArrayList<TextModel>(); for (int index = 0; index < textParams.length();
	 * index++) { JSONObject json = textParams.optJSONObject(index); TextModel
	 * textModel = new TextModel(); if (json != null) {
	 * textModel.setProperty(json.optString("property"));
	 * textModel.setValue(json.optString("value")); list.add(textModel); } } return
	 * list; } return null; }
	 */

	/*
	 * private static List<RangeModel> getRangeModel(JSONArray textParams) { if
	 * (textParams != null && textParams.length() > 0) { List<RangeModel> list = new
	 * ArrayList<RangeModel>(); for (int index = 0; index < textParams.length();
	 * index++) { JSONObject json = textParams.optJSONObject(index); RangeModel
	 * rangeModel = new RangeModel(); if (json != null) {
	 * rangeModel.setProperty(json.optString("property"));
	 * rangeModel.setMaxValue(json.optDouble("maxValue"));
	 * rangeModel.setMinValue(json.optDouble("minValue"));
	 * rangeModel.setUom(json.optString("uom")); list.add(rangeModel); } } return
	 * list; } return null; }
	 */
}
