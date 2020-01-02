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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the column that should be used for filtering the query response by groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AclConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AclConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is
     * only returned to users that are in one of the groups specified in the <code>UserContext</code> field of the
     * <a>Query</a> operation.
     * </p>
     */
    private String allowedGroupsColumnName;

    /**
     * <p>
     * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is
     * only returned to users that are in one of the groups specified in the <code>UserContext</code> field of the
     * <a>Query</a> operation.
     * </p>
     * 
     * @param allowedGroupsColumnName
     *        A list of groups, separated by semi-colons, that filters a query response based on user context. The
     *        document is only returned to users that are in one of the groups specified in the <code>UserContext</code>
     *        field of the <a>Query</a> operation.
     */

    public void setAllowedGroupsColumnName(String allowedGroupsColumnName) {
        this.allowedGroupsColumnName = allowedGroupsColumnName;
    }

    /**
     * <p>
     * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is
     * only returned to users that are in one of the groups specified in the <code>UserContext</code> field of the
     * <a>Query</a> operation.
     * </p>
     * 
     * @return A list of groups, separated by semi-colons, that filters a query response based on user context. The
     *         document is only returned to users that are in one of the groups specified in the
     *         <code>UserContext</code> field of the <a>Query</a> operation.
     */

    public String getAllowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    /**
     * <p>
     * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is
     * only returned to users that are in one of the groups specified in the <code>UserContext</code> field of the
     * <a>Query</a> operation.
     * </p>
     * 
     * @param allowedGroupsColumnName
     *        A list of groups, separated by semi-colons, that filters a query response based on user context. The
     *        document is only returned to users that are in one of the groups specified in the <code>UserContext</code>
     *        field of the <a>Query</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AclConfiguration withAllowedGroupsColumnName(String allowedGroupsColumnName) {
        setAllowedGroupsColumnName(allowedGroupsColumnName);
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
        if (getAllowedGroupsColumnName() != null)
            sb.append("AllowedGroupsColumnName: ").append(getAllowedGroupsColumnName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AclConfiguration == false)
            return false;
        AclConfiguration other = (AclConfiguration) obj;
        if (other.getAllowedGroupsColumnName() == null ^ this.getAllowedGroupsColumnName() == null)
            return false;
        if (other.getAllowedGroupsColumnName() != null && other.getAllowedGroupsColumnName().equals(this.getAllowedGroupsColumnName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedGroupsColumnName() == null) ? 0 : getAllowedGroupsColumnName().hashCode());
        return hashCode;
    }

    @Override
    public AclConfiguration clone() {
        try {
            return (AclConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AclConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
