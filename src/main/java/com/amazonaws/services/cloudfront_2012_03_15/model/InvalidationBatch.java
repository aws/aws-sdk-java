/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * <p>
 * An invalidation batch.
 * </p>
 */
public class InvalidationBatch {

    /**
     * The path of the object to invalidate. The path is relative to the
     * distribution and must begin with a slash (/). You must enclose each
     * invalidation object with the Path element tags. If the path includes
     * non-ASCII characters or unsafe characters as defined in RFC 1783
     * (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     * not URL encode any other characters in the path, or CloudFront will
     * not invalidate the old version of the updated object.
     */
    private java.util.List<String> paths;

    /**
     * A unique name that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the Path object), a
     * new distribution is created. If the CallerReference is a value you
     * already sent in a previous request to create an invalidation batch,
     * and the content of each Path element is identical to the original
     * request, the response includes the same information returned to the
     * original request. If the CallerReference is a value you already sent
     * in a previous request to create a distribution but the content of any
     * Path is different from the original request, CloudFront returns an
     * InvalidationBatchAlreadyExists error.
     */
    private String callerReference;

    /**
     * Default constructor for a new InvalidationBatch object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InvalidationBatch() {}
    
    /**
     * Constructs a new InvalidationBatch object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param paths The path of the object to invalidate. The path is
     * relative to the distribution and must begin with a slash (/). You must
     * enclose each invalidation object with the Path element tags. If the
     * path includes non-ASCII characters or unsafe characters as defined in
     * RFC 1783 (http://www.ietf.org/rfc/rfc1738.txt), URL encode those
     * characters. Do not URL encode any other characters in the path, or
     * CloudFront will not invalidate the old version of the updated object.
     * @param callerReference A unique name that ensures the request can't be
     * replayed. If the CallerReference is new (no matter the content of the
     * Path object), a new distribution is created. If the CallerReference is
     * a value you already sent in a previous request to create an
     * invalidation batch, and the content of each Path element is identical
     * to the original request, the response includes the same information
     * returned to the original request. If the CallerReference is a value
     * you already sent in a previous request to create a distribution but
     * the content of any Path is different from the original request,
     * CloudFront returns an InvalidationBatchAlreadyExists error.
     */
    public InvalidationBatch(java.util.List<String> paths, String callerReference) {
        this.paths = paths;
        this.callerReference = callerReference;
    }

    
    
    /**
     * Constructs a new InvalidationBatch object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param callerReference A unique name that ensures the request can't be
     * replayed. If the CallerReference is new (no matter the content of the
     * Path object), a new distribution is created. If the CallerReference is
     * a value you already sent in a previous request to create an
     * invalidation batch, and the content of each Path element is identical
     * to the original request, the response includes the same information
     * returned to the original request. If the CallerReference is a value
     * you already sent in a previous request to create a distribution but
     * the content of any Path is different from the original request,
     * CloudFront returns an InvalidationBatchAlreadyExists error.
     */
    public InvalidationBatch(String callerReference) {
        this.callerReference = callerReference;
    }

    
    
    /**
     * The path of the object to invalidate. The path is relative to the
     * distribution and must begin with a slash (/). You must enclose each
     * invalidation object with the Path element tags. If the path includes
     * non-ASCII characters or unsafe characters as defined in RFC 1783
     * (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     * not URL encode any other characters in the path, or CloudFront will
     * not invalidate the old version of the updated object.
     *
     * @return The path of the object to invalidate. The path is relative to the
     *         distribution and must begin with a slash (/). You must enclose each
     *         invalidation object with the Path element tags. If the path includes
     *         non-ASCII characters or unsafe characters as defined in RFC 1783
     *         (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     *         not URL encode any other characters in the path, or CloudFront will
     *         not invalidate the old version of the updated object.
     */
    public java.util.List<String> getPaths() {
        
        if (paths == null) {
            paths = new java.util.ArrayList<String>();
        }
        return paths;
    }
    
    /**
     * The path of the object to invalidate. The path is relative to the
     * distribution and must begin with a slash (/). You must enclose each
     * invalidation object with the Path element tags. If the path includes
     * non-ASCII characters or unsafe characters as defined in RFC 1783
     * (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     * not URL encode any other characters in the path, or CloudFront will
     * not invalidate the old version of the updated object.
     *
     * @param paths The path of the object to invalidate. The path is relative to the
     *         distribution and must begin with a slash (/). You must enclose each
     *         invalidation object with the Path element tags. If the path includes
     *         non-ASCII characters or unsafe characters as defined in RFC 1783
     *         (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     *         not URL encode any other characters in the path, or CloudFront will
     *         not invalidate the old version of the updated object.
     */
    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        java.util.List<String> pathsCopy = new java.util.ArrayList<String>(paths.size());
        pathsCopy.addAll(paths);
        this.paths = pathsCopy;
    }
    
    /**
     * The path of the object to invalidate. The path is relative to the
     * distribution and must begin with a slash (/). You must enclose each
     * invalidation object with the Path element tags. If the path includes
     * non-ASCII characters or unsafe characters as defined in RFC 1783
     * (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     * not URL encode any other characters in the path, or CloudFront will
     * not invalidate the old version of the updated object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param paths The path of the object to invalidate. The path is relative to the
     *         distribution and must begin with a slash (/). You must enclose each
     *         invalidation object with the Path element tags. If the path includes
     *         non-ASCII characters or unsafe characters as defined in RFC 1783
     *         (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     *         not URL encode any other characters in the path, or CloudFront will
     *         not invalidate the old version of the updated object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InvalidationBatch withPaths(String... paths) {
        if (getPaths() == null) setPaths(new java.util.ArrayList<String>(paths.length));
        for (String value : paths) {
            getPaths().add(value);
        }
        return this;
    }
    
    /**
     * The path of the object to invalidate. The path is relative to the
     * distribution and must begin with a slash (/). You must enclose each
     * invalidation object with the Path element tags. If the path includes
     * non-ASCII characters or unsafe characters as defined in RFC 1783
     * (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     * not URL encode any other characters in the path, or CloudFront will
     * not invalidate the old version of the updated object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param paths The path of the object to invalidate. The path is relative to the
     *         distribution and must begin with a slash (/). You must enclose each
     *         invalidation object with the Path element tags. If the path includes
     *         non-ASCII characters or unsafe characters as defined in RFC 1783
     *         (http://www.ietf.org/rfc/rfc1738.txt), URL encode those characters. Do
     *         not URL encode any other characters in the path, or CloudFront will
     *         not invalidate the old version of the updated object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InvalidationBatch withPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
        } else {
            java.util.List<String> pathsCopy = new java.util.ArrayList<String>(paths.size());
            pathsCopy.addAll(paths);
            this.paths = pathsCopy;
        }

        return this;
    }
    
    /**
     * A unique name that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the Path object), a
     * new distribution is created. If the CallerReference is a value you
     * already sent in a previous request to create an invalidation batch,
     * and the content of each Path element is identical to the original
     * request, the response includes the same information returned to the
     * original request. If the CallerReference is a value you already sent
     * in a previous request to create a distribution but the content of any
     * Path is different from the original request, CloudFront returns an
     * InvalidationBatchAlreadyExists error.
     *
     * @return A unique name that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the Path object), a
     *         new distribution is created. If the CallerReference is a value you
     *         already sent in a previous request to create an invalidation batch,
     *         and the content of each Path element is identical to the original
     *         request, the response includes the same information returned to the
     *         original request. If the CallerReference is a value you already sent
     *         in a previous request to create a distribution but the content of any
     *         Path is different from the original request, CloudFront returns an
     *         InvalidationBatchAlreadyExists error.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique name that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the Path object), a
     * new distribution is created. If the CallerReference is a value you
     * already sent in a previous request to create an invalidation batch,
     * and the content of each Path element is identical to the original
     * request, the response includes the same information returned to the
     * original request. If the CallerReference is a value you already sent
     * in a previous request to create a distribution but the content of any
     * Path is different from the original request, CloudFront returns an
     * InvalidationBatchAlreadyExists error.
     *
     * @param callerReference A unique name that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the Path object), a
     *         new distribution is created. If the CallerReference is a value you
     *         already sent in a previous request to create an invalidation batch,
     *         and the content of each Path element is identical to the original
     *         request, the response includes the same information returned to the
     *         original request. If the CallerReference is a value you already sent
     *         in a previous request to create a distribution but the content of any
     *         Path is different from the original request, CloudFront returns an
     *         InvalidationBatchAlreadyExists error.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique name that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the Path object), a
     * new distribution is created. If the CallerReference is a value you
     * already sent in a previous request to create an invalidation batch,
     * and the content of each Path element is identical to the original
     * request, the response includes the same information returned to the
     * original request. If the CallerReference is a value you already sent
     * in a previous request to create a distribution but the content of any
     * Path is different from the original request, CloudFront returns an
     * InvalidationBatchAlreadyExists error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param callerReference A unique name that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the Path object), a
     *         new distribution is created. If the CallerReference is a value you
     *         already sent in a previous request to create an invalidation batch,
     *         and the content of each Path element is identical to the original
     *         request, the response includes the same information returned to the
     *         original request. If the CallerReference is a value you already sent
     *         in a previous request to create a distribution but the content of any
     *         Path is different from the original request, CloudFront returns an
     *         InvalidationBatchAlreadyExists error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InvalidationBatch withCallerReference(String callerReference) {
        this.callerReference = callerReference;
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
        if (paths != null) sb.append("Paths: " + paths + ", ");
        if (callerReference != null) sb.append("CallerReference: " + callerReference + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof InvalidationBatch == false) return false;
        InvalidationBatch other = (InvalidationBatch)obj;
        
        if (other.getPaths() == null ^ this.getPaths() == null) return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        return true;
    }
    
}
    
