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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The list of <a>SettingEntry</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <code>Limit</code> member
     * of the request. This occurs if there are less than the requested number of items left to retrieve, or if the
     * limitations of the operation have been exceeded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SettingEntry> settingEntries;
    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSettingsResult withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The list of <a>SettingEntry</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <code>Limit</code> member
     * of the request. This occurs if there are less than the requested number of items left to retrieve, or if the
     * limitations of the operation have been exceeded.
     * </p>
     * 
     * @return The list of <a>SettingEntry</a> objects that were retrieved.</p>
     *         <p>
     *         It is possible that this list contains less than the number of items specified in the <code>Limit</code>
     *         member of the request. This occurs if there are less than the requested number of items left to retrieve,
     *         or if the limitations of the operation have been exceeded.
     */

    public java.util.List<SettingEntry> getSettingEntries() {
        if (settingEntries == null) {
            settingEntries = new com.amazonaws.internal.SdkInternalList<SettingEntry>();
        }
        return settingEntries;
    }

    /**
     * <p>
     * The list of <a>SettingEntry</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <code>Limit</code> member
     * of the request. This occurs if there are less than the requested number of items left to retrieve, or if the
     * limitations of the operation have been exceeded.
     * </p>
     * 
     * @param settingEntries
     *        The list of <a>SettingEntry</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <code>Limit</code>
     *        member of the request. This occurs if there are less than the requested number of items left to retrieve,
     *        or if the limitations of the operation have been exceeded.
     */

    public void setSettingEntries(java.util.Collection<SettingEntry> settingEntries) {
        if (settingEntries == null) {
            this.settingEntries = null;
            return;
        }

        this.settingEntries = new com.amazonaws.internal.SdkInternalList<SettingEntry>(settingEntries);
    }

    /**
     * <p>
     * The list of <a>SettingEntry</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <code>Limit</code> member
     * of the request. This occurs if there are less than the requested number of items left to retrieve, or if the
     * limitations of the operation have been exceeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettingEntries(java.util.Collection)} or {@link #withSettingEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param settingEntries
     *        The list of <a>SettingEntry</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <code>Limit</code>
     *        member of the request. This occurs if there are less than the requested number of items left to retrieve,
     *        or if the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSettingsResult withSettingEntries(SettingEntry... settingEntries) {
        if (this.settingEntries == null) {
            setSettingEntries(new com.amazonaws.internal.SdkInternalList<SettingEntry>(settingEntries.length));
        }
        for (SettingEntry ele : settingEntries) {
            this.settingEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>SettingEntry</a> objects that were retrieved.
     * </p>
     * <p>
     * It is possible that this list contains less than the number of items specified in the <code>Limit</code> member
     * of the request. This occurs if there are less than the requested number of items left to retrieve, or if the
     * limitations of the operation have been exceeded.
     * </p>
     * 
     * @param settingEntries
     *        The list of <a>SettingEntry</a> objects that were retrieved.</p>
     *        <p>
     *        It is possible that this list contains less than the number of items specified in the <code>Limit</code>
     *        member of the request. This occurs if there are less than the requested number of items left to retrieve,
     *        or if the limitations of the operation have been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSettingsResult withSettingEntries(java.util.Collection<SettingEntry> settingEntries) {
        setSettingEntries(settingEntries);
        return this;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, token that indicates that more results are available. Pass this value for the
     *        <code>NextToken</code> parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the
     *        next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, token that indicates that more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the
     *         next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, token that indicates that more results are available. Pass this value for the <code>NextToken</code>
     * parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, token that indicates that more results are available. Pass this value for the
     *        <code>NextToken</code> parameter in a subsequent call to <code>DescribeSettings</code> to retrieve the
     *        next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSettingsResult withNextToken(String nextToken) {
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
        if (getSettingEntries() != null)
            sb.append("SettingEntries: ").append(getSettingEntries()).append(",");
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

        if (obj instanceof DescribeSettingsResult == false)
            return false;
        DescribeSettingsResult other = (DescribeSettingsResult) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSettingEntries() == null ^ this.getSettingEntries() == null)
            return false;
        if (other.getSettingEntries() != null && other.getSettingEntries().equals(this.getSettingEntries()) == false)
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
        hashCode = prime * hashCode + ((getSettingEntries() == null) ? 0 : getSettingEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSettingsResult clone() {
        try {
            return (DescribeSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
