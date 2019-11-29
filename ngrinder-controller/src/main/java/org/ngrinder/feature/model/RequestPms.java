package org.ngrinder.feature.model;

import HTTPClient.NVPair;

import java.util.List;

/**
 * 每个请求
 */
public class RequestPms {
	private long id;
	private String funName;//生成的函数名称
	private String apiName;//设置的api名称
	private int index;//链路顺序
	//基本设置
	private int type;//请求类型，0：登陆携带cookies请求；其他待定
	private String method;//请求方法，0：GET;1:POST;2:PUT;3:DELETE;
	private Long timeout;//超时时间，单位s
	private String url;//请求url

	//header设置
	private List<NVPair> headers;

	//body设置
	private String contentType;//暂时只支持x-www-form-urlencode和raw
	private String body;//raw类型时，获取参数json
	private List<NVPair> params;//x-www-form-urlencode类型时，接收form表单数据

	//出参设置
	private List<OutParams> outParamsList;

	//检查点设置
	private List<Assertion> assertionList;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Long getTimeout() {
		return timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<NVPair> getHeaders() {
		return headers;
	}

	public void setHeaders(List<NVPair> headers) {
		this.headers = headers;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<NVPair> getParams() {
		return params;
	}

	public void setParams(List<NVPair> params) {
		this.params = params;
	}

	public List<OutParams> getOutParamsList() {
		return outParamsList;
	}

	public void setOutParamsList(List<OutParams> outParamsList) {
		this.outParamsList = outParamsList;
	}

	public List<Assertion> getAssertionList() {
		return assertionList;
	}

	public void setAssertionList(List<Assertion> assertionList) {
		this.assertionList = assertionList;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
