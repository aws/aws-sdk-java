/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that describes how you'd prefer CloudFront to respond to requests that result in either a 4xx or 5xx response. You can control whether
 * a custom error page should be displayed, what the desired response code should be for this error page and how long should the error response be cached
 * by CloudFront. If you don't want to specify any custom error responses, include only an empty CustomErrorResponses element. To delete all custom error
 * responses in an existing distribution, update the distribution configuration and include only an empty CustomErrorResponses element. To add, change,
 * or remove one or more custom error responses, update the distribution configuration and specify all of the custom error responses that you want to
 * include in the updated distribution.
 * </p>
 */
public class CustomErrorResponse implements Serializable {

    /**
     * The 4xx or 5xx HTTP status code that you want to customize. For a list
     * of HTTP status codes that you can customize, see CloudFront
     * documentation.
     */
    private Integer errorCode;

    /**
     * The path of the custom error page (for example, /custom_404.html). The
     * path is relative to the distribution and must begin with a slash (/).
     * If the path includes any non-ASCII characters or unsafe characters as
     * defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     * those characters. Do not URL encode any other characters in the path,
     * or CloudFront will not return the custom error page to the viewer.
     */
    private String responsePagePath;

    /**
     * The HTTP status code that you want CloudFront to return with the
     * custom error page to the viewer. For a list of HTTP status codes that
     * you can replace, see CloudFront Documentation.
     */
    private String responseCode;

    /**
     * The minimum amount of time you want HTTP error codes to stay in
     * CloudFront caches before CloudFront queries your origin to see whether
     * the object has been updated. You can specify a value from 0 to
     * 31,536,000.
     */
    private Long errorCachingMinTTL;

    /**
     * The 4xx or 5xx HTTP status code that you want to customize. For a list
     * of HTTP status codes that you can customize, see CloudFront
     * documentation.
     *
     * @return The 4xx or 5xx HTTP status code that you want to customize. For a list
     *         of HTTP status codes that you can customize, see CloudFront
     *         documentation.
     */
    public Integer getErrorCode() {
        return errorCode;
    }
    
    /**
     * The 4xx or 5xx HTTP status code that you want to customize. For a list
     * of HTTP status codes that you can customize, see CloudFront
     * documentation.
     *
     * @param errorCode The 4xx or 5xx HTTP status code that you want to customize. For a list
     *         of HTTP status codes that you can customize, see CloudFront
     *         documentation.
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * The 4xx or 5xx HTTP status code that you want to customize. For a list
     * of HTTP status codes that you can customize, see CloudFront
     * documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCode The 4xx or 5xx HTTP status code that you want to customize. For a list
     *         of HTTP status codes that you can customize, see CloudFront
     *         documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponse withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The path of the custom error page (for example, /custom_404.html). The
     * path is relative to the distribution and must begin with a slash (/).
     * If the path includes any non-ASCII characters or unsafe characters as
     * defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     * those characters. Do not URL encode any other characters in the path,
     * or CloudFront will not return the custom error page to the viewer.
     *
     * @return The path of the custom error page (for example, /custom_404.html). The
     *         path is relative to the distribution and must begin with a slash (/).
     *         If the path includes any non-ASCII characters or unsafe characters as
     *         defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     *         those characters. Do not URL encode any other characters in the path,
     *         or CloudFront will not return the custom error page to the viewer.
     */
    public String getResponsePagePath() {
        return responsePagePath;
    }
    
    /**
     * The path of the custom error page (for example, /custom_404.html). The
     * path is relative to the distribution and must begin with a slash (/).
     * If the path includes any non-ASCII characters or unsafe characters as
     * defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     * those characters. Do not URL encode any other characters in the path,
     * or CloudFront will not return the custom error page to the viewer.
     *
     * @param responsePagePath The path of the custom error page (for example, /custom_404.html). The
     *         path is relative to the distribution and must begin with a slash (/).
     *         If the path includes any non-ASCII characters or unsafe characters as
     *         defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     *         those characters. Do not URL encode any other characters in the path,
     *         or CloudFront will not return the custom error page to the viewer.
     */
    public void setResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
    }
    
    /**
     * The path of the custom error page (for example, /custom_404.html). The
     * path is relative to the distribution and must begin with a slash (/).
     * If the path includes any non-ASCII characters or unsafe characters as
     * defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     * those characters. Do not URL encode any other characters in the path,
     * or CloudFront will not return the custom error page to the viewer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responsePagePath The path of the custom error page (for example, /custom_404.html). The
     *         path is relative to the distribution and must begin with a slash (/).
     *         If the path includes any non-ASCII characters or unsafe characters as
     *         defined in RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode
     *         those characters. Do not URL encode any other characters in the path,
     *         or CloudFront will not return the custom error page to the viewer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponse withResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
        return this;
    }

    /**
     * The HTTP status code that you want CloudFront to return with the
     * custom error page to the viewer. For a list of HTTP status codes that
     * you can replace, see CloudFront Documentation.
     *
     * @return The HTTP status code that you want CloudFront to return with the
     *         custom error page to the viewer. For a list of HTTP status codes that
     *         you can replace, see CloudFront Documentation.
     */
    public String getResponseCode() {
        return responseCode;
    }
    
    /**
     * The HTTP status code that you want CloudFront to return with the
     * custom error page to the viewer. For a list of HTTP status codes that
     * you can replace, see CloudFront Documentation.
     *
     * @param responseCode The HTTP status code that you want CloudFront to return with the
     *         custom error page to the viewer. For a list of HTTP status codes that
     *         you can replace, see CloudFront Documentation.
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    
    /**
     * The HTTP status code that you want CloudFront to return with the
     * custom error page to the viewer. For a list of HTTP status codes that
     * you can replace, see CloudFront Documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responseCode The HTTP status code that you want CloudFront to return with the
     *         custom error page to the viewer. For a list of HTTP status codes that
     *         you can replace, see CloudFront Documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponse withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * The minimum amount of time you want HTTP error codes to stay in
     * CloudFront caches before CloudFront queries your origin to see whether
     * the object has been updated. You can specify a value from 0 to
     * 31,536,000.
     *
     * @return The minimum amount of time you want HTTP error codes to stay in
     *         CloudFront caches before CloudFront queries your origin to see whether
     *         the object has been updated. You can specify a value from 0 to
     *         31,536,000.
     */
    public Long getErrorCachingMinTTL() {
        return errorCachingMinTTL;
    }
    
    /**
     * The minimum amount of time you want HTTP error codes to stay in
     * CloudFront caches before CloudFront queries your origin to see whether
     * the object has been updated. You can specify a value from 0 to
     * 31,536,000.
     *
     * @param errorCachingMinTTL The minimum amount of time you want HTTP error codes to stay in
     *         CloudFront caches before CloudFront queries your origin to see whether
     *         the object has been updated. You can specify a value from 0 to
     *         31,536,000.
     */
    public void setErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }
    
    /**
     * The minimum amount of time you want HTTP error codes to stay in
     * CloudFront caches before CloudFront queries your origin to see whether
     * the object has been updated. You can specify a value from 0 to
     * 31,536,000.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCachingMinTTL The minimum amount of time you want HTTP error codes to stay in
     *         CloudFront caches before CloudFront queries your origin to see whether
     *         the object has been updated. You can specify a value from 0 to
     *         31,536,000.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomErrorResponse withErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getResponsePagePath() != null) sb.append("ResponsePagePath: " + getResponsePagePath() + ",");
        if (getResponseCode() != null) sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getErrorCachingMinTTL() != null) sb.append("ErrorCachingMinTTL: " + getErrorCachingMinTTL() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getResponsePagePath() == null) ? 0 : getResponsePagePath().hashCode()); 
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode()); 
        hashCode = prime * hashCode + ((getErrorCachingMinTTL() == null) ? 0 : getErrorCachingMinTTL().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CustomErrorResponse == false) return false;
        CustomErrorResponse other = (CustomErrorResponse)obj;
        
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        if (other.getResponsePagePath() == null ^ this.getResponsePagePath() == null) return false;
        if (other.getResponsePagePath() != null && other.getResponsePagePath().equals(this.getResponsePagePath()) == false) return false; 
        if (other.getResponseCode() == null ^ this.getResponseCode() == null) return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false) return false; 
        if (other.getErrorCachingMinTTL() == null ^ this.getErrorCachingMinTTL() == null) return false;
        if (other.getErrorCachingMinTTL() != null && other.getErrorCachingMinTTL().equals(this.getErrorCachingMinTTL()) == false) return false; 
        return true;
    }
    
}
    