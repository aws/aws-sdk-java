package com.amazonaws.http.apache.request.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpHeaders;

import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.request.HttpRequestFactory;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.http.urlfetch.UrlFetchUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.SdkHttpUtils;
import com.google.appengine.api.urlfetch.FetchOptions;
import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.apphosting.api.ApiProxy;

public class URLFetchRequestFactory implements HttpRequestFactory<HTTPRequest> {

    private static final List<String> ignoreHeaders = Arrays.asList(HttpHeaders.CONTENT_LENGTH, HttpHeaders.HOST);

	@Override
	public HTTPRequest create(Request<?> request, HttpClientSettings settings) throws IOException {
		String uri = SdkHttpUtils.appendUri(request.getEndpoint().toString(), request.getResourcePath(), true);
		String encodedParams = SdkHttpUtils.encodeParameters(request);
		
        /*
         * For all non-POST requests, and any POST requests that already have a
         * payload, we put the encoded params directly in the URI, otherwise,
         * we'll put them in the POST request's payload.
         */
        boolean requestHasNoPayload = request.getContent() != null;
        boolean requestIsPost = request.getHttpMethod() == HttpMethodName.POST;
        boolean putParamsInUri = !requestIsPost || requestHasNoPayload;
        if (encodedParams != null && putParamsInUri) {
            uri += "?" + encodedParams;
        }
        
        HTTPRequest urlFetchRequest = createUrlFetchRequest(request, uri, encodedParams, settings);
        addHeadersToRequest(request, urlFetchRequest);
        return urlFetchRequest;
	}

	private HTTPRequest createUrlFetchRequest(Request<?> request, String uri, String encodedParams, HttpClientSettings settings) throws IOException {
		FetchOptions fetchOptions = FetchOptions.Builder.doNotFollowRedirects();
		if (settings.getUrlFetchOptions() != null) {			
			fetchOptions = settings.getUrlFetchOptions();
		}
		URL urlObject = new URL(uri);
		HTTPMethod urlFetchMethod = translateMethod(request);
		HTTPRequest urlFetchRequest = new HTTPRequest(urlObject, urlFetchMethod, fetchOptions);
		if (urlFetchMethod == HTTPMethod.POST) {
			urlFetchRequest.setPayload(IOUtils.toByteArray(request.getContent()));
		}
		return urlFetchRequest;
	}
	
	private HTTPMethod translateMethod(Request<?> request) {
		switch (request.getHttpMethod()) {
		case DELETE:
			return HTTPMethod.DELETE;
		case GET:
			return HTTPMethod.GET;
		case HEAD:
			return HTTPMethod.HEAD;
		case PATCH:
			return HTTPMethod.PATCH;
		case POST:
			return HTTPMethod.POST;
		case PUT:
			return HTTPMethod.PUT;
		case OPTIONS:
		default:
			return null;//TODOGAE Log
		}
	}
	
	private void addHeadersToRequest(Request<?> request, HTTPRequest urlFetchRequest) {
		urlFetchRequest.addHeader(new HTTPHeader(HttpHeaders.HOST, getHostHeaderValue(request.getEndpoint())));
		for (Entry<String, String> headerEntry : request.getHeaders().entrySet()) {
			if (ignoreHeaders.contains(headerEntry.getKey())) {
				System.err.println("Skipping header because we're gangsters: " + headerEntry.getKey() + " = " + headerEntry.getValue());
				continue;
			}
			urlFetchRequest.addHeader(new HTTPHeader(headerEntry.getKey(), headerEntry.getValue()));
			System.err.println("Adding header: " + headerEntry.getKey() + " = " + headerEntry.getValue());
		}
		if (UrlFetchUtils.getHeader(urlFetchRequest, HttpHeaders.CONTENT_TYPE) == null) {
			urlFetchRequest.addHeader(new HTTPHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=utf-8"));
			System.err.println("Setting CONTENT_TYPE header because it was null!");
		} else {
			System.err.println("CONTENT_TYPE was already set!");
		}
	}
	
    private String getHostHeaderValue(final URI endpoint) {
        /*
         * Apache HttpClient omits the port number in the Host header (even if
         * we explicitly specify it) if it's the default port for the protocol
         * in use. To ensure that we use the same Host header in the request and
         * in the calculated string to sign (even if Apache HttpClient changed
         * and started honoring our explicit host with endpoint), we follow this
         * same behavior here and in the QueryString signer.
         */
        return SdkHttpUtils.isUsingNonDefaultPort(endpoint)
                ? endpoint.getHost() + ":" + endpoint.getPort()
                : endpoint.getHost();
    }
}
