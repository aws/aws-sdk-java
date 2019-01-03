/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportSnapshotRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     * request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     * request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     *        request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     * request.
     * </p>
     * 
     * @return A token used for advancing to a specific page of results for your
     *         <code>get export snapshot records</code> request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     * request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results for your <code>get export snapshot records</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportSnapshotRecordsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportSnapshotRecordsRequest == false)
            return false;
        GetExportSnapshotRecordsRequest other = (GetExportSnapshotRecordsRequest) obj;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExportSnapshotRecordsRequest clone() {
        return (GetExportSnapshotRecordsRequest) super.clone();
    }

}
