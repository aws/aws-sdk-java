/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeClientAuthenticationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientAuthenticationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to retrieve information.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The type of client authentication for which to retrieve information. If no type is specified, a list of all
     * client authentication types that are supported for the specified directory is retrieved.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     * <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The identifier of the directory for which to retrieve information.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to retrieve information.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to retrieve information.
     * </p>
     * 
     * @return The identifier of the directory for which to retrieve information.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to retrieve information.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The type of client authentication for which to retrieve information. If no type is specified, a list of all
     * client authentication types that are supported for the specified directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for which to retrieve information. If no type is specified, a list of
     *        all client authentication types that are supported for the specified directory is retrieved.
     * @see ClientAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of client authentication for which to retrieve information. If no type is specified, a list of all
     * client authentication types that are supported for the specified directory is retrieved.
     * </p>
     * 
     * @return The type of client authentication for which to retrieve information. If no type is specified, a list of
     *         all client authentication types that are supported for the specified directory is retrieved.
     * @see ClientAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of client authentication for which to retrieve information. If no type is specified, a list of all
     * client authentication types that are supported for the specified directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for which to retrieve information. If no type is specified, a list of
     *        all client authentication types that are supported for the specified directory is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public DescribeClientAuthenticationSettingsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of client authentication for which to retrieve information. If no type is specified, a list of all
     * client authentication types that are supported for the specified directory is retrieved.
     * </p>
     * 
     * @param type
     *        The type of client authentication for which to retrieve information. If no type is specified, a list of
     *        all client authentication types that are supported for the specified directory is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public DescribeClientAuthenticationSettingsRequest withType(ClientAuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     * <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     *        <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     * <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     * </p>
     * 
     * @return The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     *         <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     * <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeClientAuthenticationSettingsResult.NextToken</i> value from a previous call to
     *        <a>DescribeClientAuthenticationSettings</a>. Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *        the limitations of the operation.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @return The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *         the limitations of the operation.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the
     * limitations of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If this value is zero, the maximum number of items is specified by
     *        the limitations of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClientAuthenticationSettingsRequest == false)
            return false;
        DescribeClientAuthenticationSettingsRequest other = (DescribeClientAuthenticationSettingsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientAuthenticationSettingsRequest clone() {
        return (DescribeClientAuthenticationSettingsRequest) super.clone();
    }

}
