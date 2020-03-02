/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed
     * resource. The value is a <code>FailureInfo</code> object that contains an error code, a status code, and an error
     * message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     * </p>
     */
    private java.util.Map<String, FailureInfo> failedResourcesMap;

    /**
     * <p>
     * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed
     * resource. The value is a <code>FailureInfo</code> object that contains an error code, a status code, and an error
     * message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     * </p>
     * 
     * @return A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the
     *         failed resource. The value is a <code>FailureInfo</code> object that contains an error code, a status
     *         code, and an error message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     */

    public java.util.Map<String, FailureInfo> getFailedResourcesMap() {
        return failedResourcesMap;
    }

    /**
     * <p>
     * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed
     * resource. The value is a <code>FailureInfo</code> object that contains an error code, a status code, and an error
     * message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     * </p>
     * 
     * @param failedResourcesMap
     *        A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the
     *        failed resource. The value is a <code>FailureInfo</code> object that contains an error code, a status
     *        code, and an error message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     */

    public void setFailedResourcesMap(java.util.Map<String, FailureInfo> failedResourcesMap) {
        this.failedResourcesMap = failedResourcesMap;
    }

    /**
     * <p>
     * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed
     * resource. The value is a <code>FailureInfo</code> object that contains an error code, a status code, and an error
     * message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     * </p>
     * 
     * @param failedResourcesMap
     *        A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the
     *        failed resource. The value is a <code>FailureInfo</code> object that contains an error code, a status
     *        code, and an error message. If there are no errors, the <code>FailedResourcesMap</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesResult withFailedResourcesMap(java.util.Map<String, FailureInfo> failedResourcesMap) {
        setFailedResourcesMap(failedResourcesMap);
        return this;
    }

    /**
     * Add a single FailedResourcesMap entry
     *
     * @see TagResourcesResult#withFailedResourcesMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesResult addFailedResourcesMapEntry(String key, FailureInfo value) {
        if (null == this.failedResourcesMap) {
            this.failedResourcesMap = new java.util.HashMap<String, FailureInfo>();
        }
        if (this.failedResourcesMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedResourcesMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedResourcesMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesResult clearFailedResourcesMapEntries() {
        this.failedResourcesMap = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailedResourcesMap() != null)
            sb.append("FailedResourcesMap: ").append(getFailedResourcesMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourcesResult == false)
            return false;
        TagResourcesResult other = (TagResourcesResult) obj;
        if (other.getFailedResourcesMap() == null ^ this.getFailedResourcesMap() == null)
            return false;
        if (other.getFailedResourcesMap() != null && other.getFailedResourcesMap().equals(this.getFailedResourcesMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedResourcesMap() == null) ? 0 : getFailedResourcesMap().hashCode());
        return hashCode;
    }

    @Override
    public TagResourcesResult clone() {
        try {
            return (TagResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
