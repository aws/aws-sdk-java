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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3AccessControlPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3AccessControlPolicy implements Serializable, Cloneable {

    /** <p/> */
    private S3AccessControlList accessControlList;
    /** <p/> */
    private String cannedAccessControlList;

    /**
     * <p/>
     * 
     * @param accessControlList
     */

    public void setAccessControlList(S3AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public S3AccessControlList getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * <p/>
     * 
     * @param accessControlList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessControlPolicy withAccessControlList(S3AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @see S3CannedAccessControlList
     */

    public void setCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3CannedAccessControlList
     */

    public String getCannedAccessControlList() {
        return this.cannedAccessControlList;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAccessControlList
     */

    public S3AccessControlPolicy withCannedAccessControlList(String cannedAccessControlList) {
        setCannedAccessControlList(cannedAccessControlList);
        return this;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAccessControlList
     */

    public S3AccessControlPolicy withCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
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
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getCannedAccessControlList() != null)
            sb.append("CannedAccessControlList: ").append(getCannedAccessControlList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3AccessControlPolicy == false)
            return false;
        S3AccessControlPolicy other = (S3AccessControlPolicy) obj;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getCannedAccessControlList() == null ^ this.getCannedAccessControlList() == null)
            return false;
        if (other.getCannedAccessControlList() != null && other.getCannedAccessControlList().equals(this.getCannedAccessControlList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getCannedAccessControlList() == null) ? 0 : getCannedAccessControlList().hashCode());
        return hashCode;
    }

    @Override
    public S3AccessControlPolicy clone() {
        try {
            return (S3AccessControlPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
