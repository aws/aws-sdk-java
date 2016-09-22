/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The record identifier of the ProvisionedProduct object for which to retrieve output information. This is the
     * <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The record identifier of the ProvisionedProduct object for which to retrieve output information. This is the
     * <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     * </p>
     * 
     * @param id
     *        The record identifier of the ProvisionedProduct object for which to retrieve output information. This is
     *        the <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The record identifier of the ProvisionedProduct object for which to retrieve output information. This is the
     * <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     * </p>
     * 
     * @return The record identifier of the ProvisionedProduct object for which to retrieve output information. This is
     *         the <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The record identifier of the ProvisionedProduct object for which to retrieve output information. This is the
     * <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     * </p>
     * 
     * @param id
     *        The record identifier of the ProvisionedProduct object for which to retrieve output information. This is
     *        the <code>RecordDetail.RecordId</code> obtained from the request operation's response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @return The page token of the first page retrieved. If null, this retrieves the first page of size
     *         <code>PageSize</code>.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return in the results. If more results exist than fit in the specified
     *        <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @return The maximum number of items to return in the results. If more results exist than fit in the specified
     *         <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return in the results. If more results exist than fit in the specified
     *        <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecordRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecordRequest == false)
            return false;
        DescribeRecordRequest other = (DescribeRecordRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecordRequest clone() {
        return (DescribeRecordRequest) super.clone();
    }
}
