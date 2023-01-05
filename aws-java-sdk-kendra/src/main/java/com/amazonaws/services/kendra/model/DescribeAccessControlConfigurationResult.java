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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeAccessControlConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessControlConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name for the access control configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the access control configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The error message containing details if there are issues processing the access control configuration.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Information on principals (users and/or groups) and which documents they should have access to. This is useful
     * for user context filtering, where search results are filtered based on the user or their group access to
     * documents.
     * </p>
     */
    private java.util.List<Principal> accessControlList;
    /**
     * <p>
     * The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to.
     * </p>
     */
    private java.util.List<HierarchicalPrincipal> hierarchicalAccessControlList;

    /**
     * <p>
     * The name for the access control configuration.
     * </p>
     * 
     * @param name
     *        The name for the access control configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the access control configuration.
     * </p>
     * 
     * @return The name for the access control configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the access control configuration.
     * </p>
     * 
     * @param name
     *        The name for the access control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the access control configuration.
     * </p>
     * 
     * @param description
     *        The description for the access control configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the access control configuration.
     * </p>
     * 
     * @return The description for the access control configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the access control configuration.
     * </p>
     * 
     * @param description
     *        The description for the access control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the access control configuration.
     * </p>
     * 
     * @param errorMessage
     *        The error message containing details if there are issues processing the access control configuration.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the access control configuration.
     * </p>
     * 
     * @return The error message containing details if there are issues processing the access control configuration.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the access control configuration.
     * </p>
     * 
     * @param errorMessage
     *        The error message containing details if there are issues processing the access control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Information on principals (users and/or groups) and which documents they should have access to. This is useful
     * for user context filtering, where search results are filtered based on the user or their group access to
     * documents.
     * </p>
     * 
     * @return Information on principals (users and/or groups) and which documents they should have access to. This is
     *         useful for user context filtering, where search results are filtered based on the user or their group
     *         access to documents.
     */

    public java.util.List<Principal> getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * Information on principals (users and/or groups) and which documents they should have access to. This is useful
     * for user context filtering, where search results are filtered based on the user or their group access to
     * documents.
     * </p>
     * 
     * @param accessControlList
     *        Information on principals (users and/or groups) and which documents they should have access to. This is
     *        useful for user context filtering, where search results are filtered based on the user or their group
     *        access to documents.
     */

    public void setAccessControlList(java.util.Collection<Principal> accessControlList) {
        if (accessControlList == null) {
            this.accessControlList = null;
            return;
        }

        this.accessControlList = new java.util.ArrayList<Principal>(accessControlList);
    }

    /**
     * <p>
     * Information on principals (users and/or groups) and which documents they should have access to. This is useful
     * for user context filtering, where search results are filtered based on the user or their group access to
     * documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlList(java.util.Collection)} or {@link #withAccessControlList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accessControlList
     *        Information on principals (users and/or groups) and which documents they should have access to. This is
     *        useful for user context filtering, where search results are filtered based on the user or their group
     *        access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withAccessControlList(Principal... accessControlList) {
        if (this.accessControlList == null) {
            setAccessControlList(new java.util.ArrayList<Principal>(accessControlList.length));
        }
        for (Principal ele : accessControlList) {
            this.accessControlList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information on principals (users and/or groups) and which documents they should have access to. This is useful
     * for user context filtering, where search results are filtered based on the user or their group access to
     * documents.
     * </p>
     * 
     * @param accessControlList
     *        Information on principals (users and/or groups) and which documents they should have access to. This is
     *        useful for user context filtering, where search results are filtered based on the user or their group
     *        access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withAccessControlList(java.util.Collection<Principal> accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to.
     * </p>
     * 
     * @return The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *         that define the hierarchy for which documents users should have access to.
     */

    public java.util.List<HierarchicalPrincipal> getHierarchicalAccessControlList() {
        return hierarchicalAccessControlList;
    }

    /**
     * <p>
     * The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to.
     * </p>
     * 
     * @param hierarchicalAccessControlList
     *        The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to.
     */

    public void setHierarchicalAccessControlList(java.util.Collection<HierarchicalPrincipal> hierarchicalAccessControlList) {
        if (hierarchicalAccessControlList == null) {
            this.hierarchicalAccessControlList = null;
            return;
        }

        this.hierarchicalAccessControlList = new java.util.ArrayList<HierarchicalPrincipal>(hierarchicalAccessControlList);
    }

    /**
     * <p>
     * The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHierarchicalAccessControlList(java.util.Collection)} or
     * {@link #withHierarchicalAccessControlList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hierarchicalAccessControlList
     *        The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withHierarchicalAccessControlList(HierarchicalPrincipal... hierarchicalAccessControlList) {
        if (this.hierarchicalAccessControlList == null) {
            setHierarchicalAccessControlList(new java.util.ArrayList<HierarchicalPrincipal>(hierarchicalAccessControlList.length));
        }
        for (HierarchicalPrincipal ele : hierarchicalAccessControlList) {
            this.hierarchicalAccessControlList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to.
     * </p>
     * 
     * @param hierarchicalAccessControlList
     *        The list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessControlConfigurationResult withHierarchicalAccessControlList(java.util.Collection<HierarchicalPrincipal> hierarchicalAccessControlList) {
        setHierarchicalAccessControlList(hierarchicalAccessControlList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getHierarchicalAccessControlList() != null)
            sb.append("HierarchicalAccessControlList: ").append(getHierarchicalAccessControlList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessControlConfigurationResult == false)
            return false;
        DescribeAccessControlConfigurationResult other = (DescribeAccessControlConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getHierarchicalAccessControlList() == null ^ this.getHierarchicalAccessControlList() == null)
            return false;
        if (other.getHierarchicalAccessControlList() != null
                && other.getHierarchicalAccessControlList().equals(this.getHierarchicalAccessControlList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getHierarchicalAccessControlList() == null) ? 0 : getHierarchicalAccessControlList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessControlConfigurationResult clone() {
        try {
            return (DescribeAccessControlConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
