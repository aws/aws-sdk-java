/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * User accounts whose documents should be indexed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/OneDriveUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OneDriveUsers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names in email format, for example,
     * <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * </p>
     */
    private java.util.List<String> oneDriveUserList;
    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose documents should be indexed.
     * </p>
     */
    private S3Path oneDriveUserS3Path;

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names in email format, for example,
     * <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * </p>
     * 
     * @return A list of users whose documents should be indexed. Specify the user names in email format, for example,
     *         <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     *         <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     */

    public java.util.List<String> getOneDriveUserList() {
        return oneDriveUserList;
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names in email format, for example,
     * <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * </p>
     * 
     * @param oneDriveUserList
     *        A list of users whose documents should be indexed. Specify the user names in email format, for example,
     *        <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     *        <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     */

    public void setOneDriveUserList(java.util.Collection<String> oneDriveUserList) {
        if (oneDriveUserList == null) {
            this.oneDriveUserList = null;
            return;
        }

        this.oneDriveUserList = new java.util.ArrayList<String>(oneDriveUserList);
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names in email format, for example,
     * <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOneDriveUserList(java.util.Collection)} or {@link #withOneDriveUserList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param oneDriveUserList
     *        A list of users whose documents should be indexed. Specify the user names in email format, for example,
     *        <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     *        <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveUsers withOneDriveUserList(String... oneDriveUserList) {
        if (this.oneDriveUserList == null) {
            setOneDriveUserList(new java.util.ArrayList<String>(oneDriveUserList.length));
        }
        for (String ele : oneDriveUserList) {
            this.oneDriveUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users whose documents should be indexed. Specify the user names in email format, for example,
     * <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     * <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * </p>
     * 
     * @param oneDriveUserList
     *        A list of users whose documents should be indexed. Specify the user names in email format, for example,
     *        <code>username@tenantdomain</code>. If you need to index the documents of more than 100 users, use the
     *        <code>OneDriveUserS3Path</code> field to specify the location of a file containing a list of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveUsers withOneDriveUserList(java.util.Collection<String> oneDriveUserList) {
        setOneDriveUserList(oneDriveUserList);
        return this;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose documents should be indexed.
     * </p>
     * 
     * @param oneDriveUserS3Path
     *        The S3 bucket location of a file containing a list of users whose documents should be indexed.
     */

    public void setOneDriveUserS3Path(S3Path oneDriveUserS3Path) {
        this.oneDriveUserS3Path = oneDriveUserS3Path;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose documents should be indexed.
     * </p>
     * 
     * @return The S3 bucket location of a file containing a list of users whose documents should be indexed.
     */

    public S3Path getOneDriveUserS3Path() {
        return this.oneDriveUserS3Path;
    }

    /**
     * <p>
     * The S3 bucket location of a file containing a list of users whose documents should be indexed.
     * </p>
     * 
     * @param oneDriveUserS3Path
     *        The S3 bucket location of a file containing a list of users whose documents should be indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OneDriveUsers withOneDriveUserS3Path(S3Path oneDriveUserS3Path) {
        setOneDriveUserS3Path(oneDriveUserS3Path);
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
        if (getOneDriveUserList() != null)
            sb.append("OneDriveUserList: ").append(getOneDriveUserList()).append(",");
        if (getOneDriveUserS3Path() != null)
            sb.append("OneDriveUserS3Path: ").append(getOneDriveUserS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OneDriveUsers == false)
            return false;
        OneDriveUsers other = (OneDriveUsers) obj;
        if (other.getOneDriveUserList() == null ^ this.getOneDriveUserList() == null)
            return false;
        if (other.getOneDriveUserList() != null && other.getOneDriveUserList().equals(this.getOneDriveUserList()) == false)
            return false;
        if (other.getOneDriveUserS3Path() == null ^ this.getOneDriveUserS3Path() == null)
            return false;
        if (other.getOneDriveUserS3Path() != null && other.getOneDriveUserS3Path().equals(this.getOneDriveUserS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOneDriveUserList() == null) ? 0 : getOneDriveUserList().hashCode());
        hashCode = prime * hashCode + ((getOneDriveUserS3Path() == null) ? 0 : getOneDriveUserS3Path().hashCode());
        return hashCode;
    }

    @Override
    public OneDriveUsers clone() {
        try {
            return (OneDriveUsers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.OneDriveUsersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
