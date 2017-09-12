package com.amazonaws.http.urlfetch;

import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;

public abstract class UrlFetchUtils {
	public static HTTPHeader getHeader(HTTPResponse response, String headerName) {
		for (HTTPHeader header : response.getHeaders()) {
			if (header.getName().equalsIgnoreCase(headerName)) {
				return header;
			}
		}
		return null;
	}
	
	public static HTTPHeader getHeader(HTTPRequest request, String headerName) {
		for (HTTPHeader header : request.getHeaders()) {
			if (header.getName().equalsIgnoreCase(headerName)) {
				return header;
			}
		}
		return null;
	}
}
