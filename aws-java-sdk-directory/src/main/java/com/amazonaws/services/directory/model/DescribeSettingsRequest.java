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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to retrieve information.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The status of the directory settings for which to retrieve information.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>. Pass
     * null if this is the first call.
     * </p>
     */
    private String nextToken;

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

    public DescribeSettingsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The status of the directory settings for which to retrieve information.
     * </p>
     * 
     * @param status
     *        The status of the directory settings for which to retrieve information.
     * @see DirectoryConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the directory settings for which to retrieve information.
     * </p>
     * 
     * @return The status of the directory settings for which to retrieve information.
     * @see DirectoryConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the directory settings for which to retrieve information.
     * </p>
     * 
     * @param status
     *        The status of the directory settings for which to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryConfigurationStatus
     */

    public DescribeSettingsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the directory settings for which to retrieve information.
     * </p>
     * 
     * @param status
     *        The status of the directory settings for which to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryConfigurationStatus
     */

    public DescribeSettingsRequest withStatus(DirectoryConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>. Pass
     * null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>.
     *        Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>. Pass
     * null if this is the first call.
     * </p>
     * 
     * @return The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>.
     *         Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>. Pass
     * null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>DescribeSettingsResult.NextToken</code> value from a previous call to <a>DescribeSettings</a>.
     *        Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSettingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSettingsRequest == false)
            return false;
        DescribeSettingsRequest other = (DescribeSettingsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSettingsRequest clone() {
        return (DescribeSettingsRequest) super.clone();
    }

}
