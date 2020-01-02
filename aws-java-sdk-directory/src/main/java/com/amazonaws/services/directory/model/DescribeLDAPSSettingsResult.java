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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeLDAPSSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLDAPSSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about LDAP security for the specified directory, including status of enablement, state last updated
     * date time, and the reason for the state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LDAPSSettingInfo> lDAPSSettingsInfo;
    /**
     * <p>
     * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is
     * another page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about LDAP security for the specified directory, including status of enablement, state last updated
     * date time, and the reason for the state.
     * </p>
     * 
     * @return Information about LDAP security for the specified directory, including status of enablement, state last
     *         updated date time, and the reason for the state.
     */

    public java.util.List<LDAPSSettingInfo> getLDAPSSettingsInfo() {
        if (lDAPSSettingsInfo == null) {
            lDAPSSettingsInfo = new com.amazonaws.internal.SdkInternalList<LDAPSSettingInfo>();
        }
        return lDAPSSettingsInfo;
    }

    /**
     * <p>
     * Information about LDAP security for the specified directory, including status of enablement, state last updated
     * date time, and the reason for the state.
     * </p>
     * 
     * @param lDAPSSettingsInfo
     *        Information about LDAP security for the specified directory, including status of enablement, state last
     *        updated date time, and the reason for the state.
     */

    public void setLDAPSSettingsInfo(java.util.Collection<LDAPSSettingInfo> lDAPSSettingsInfo) {
        if (lDAPSSettingsInfo == null) {
            this.lDAPSSettingsInfo = null;
            return;
        }

        this.lDAPSSettingsInfo = new com.amazonaws.internal.SdkInternalList<LDAPSSettingInfo>(lDAPSSettingsInfo);
    }

    /**
     * <p>
     * Information about LDAP security for the specified directory, including status of enablement, state last updated
     * date time, and the reason for the state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLDAPSSettingsInfo(java.util.Collection)} or {@link #withLDAPSSettingsInfo(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lDAPSSettingsInfo
     *        Information about LDAP security for the specified directory, including status of enablement, state last
     *        updated date time, and the reason for the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLDAPSSettingsResult withLDAPSSettingsInfo(LDAPSSettingInfo... lDAPSSettingsInfo) {
        if (this.lDAPSSettingsInfo == null) {
            setLDAPSSettingsInfo(new com.amazonaws.internal.SdkInternalList<LDAPSSettingInfo>(lDAPSSettingsInfo.length));
        }
        for (LDAPSSettingInfo ele : lDAPSSettingsInfo) {
            this.lDAPSSettingsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about LDAP security for the specified directory, including status of enablement, state last updated
     * date time, and the reason for the state.
     * </p>
     * 
     * @param lDAPSSettingsInfo
     *        Information about LDAP security for the specified directory, including status of enablement, state last
     *        updated date time, and the reason for the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLDAPSSettingsResult withLDAPSSettingsInfo(java.util.Collection<LDAPSSettingInfo> lDAPSSettingsInfo) {
        setLDAPSSettingsInfo(lDAPSSettingsInfo);
        return this;
    }

    /**
     * <p>
     * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is
     * another page.
     * </p>
     * 
     * @param nextToken
     *        The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and
     *        there is another page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is
     * another page.
     * </p>
     * 
     * @return The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and
     *         there is another page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is
     * another page.
     * </p>
     * 
     * @param nextToken
     *        The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and
     *        there is another page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLDAPSSettingsResult withNextToken(String nextToken) {
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
        if (getLDAPSSettingsInfo() != null)
            sb.append("LDAPSSettingsInfo: ").append(getLDAPSSettingsInfo()).append(",");
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

        if (obj instanceof DescribeLDAPSSettingsResult == false)
            return false;
        DescribeLDAPSSettingsResult other = (DescribeLDAPSSettingsResult) obj;
        if (other.getLDAPSSettingsInfo() == null ^ this.getLDAPSSettingsInfo() == null)
            return false;
        if (other.getLDAPSSettingsInfo() != null && other.getLDAPSSettingsInfo().equals(this.getLDAPSSettingsInfo()) == false)
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

        hashCode = prime * hashCode + ((getLDAPSSettingsInfo() == null) ? 0 : getLDAPSSettingsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLDAPSSettingsResult clone() {
        try {
            return (DescribeLDAPSSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
