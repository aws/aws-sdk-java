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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListFieldLevelEncryptionProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFieldLevelEncryptionProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     */
    private FieldLevelEncryptionProfileList fieldLevelEncryptionProfileList;

    /**
     * <p>
     * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileList
     *        Returns a list of the field-level encryption profiles that have been created in CloudFront for this
     *        account.
     */

    public void setFieldLevelEncryptionProfileList(FieldLevelEncryptionProfileList fieldLevelEncryptionProfileList) {
        this.fieldLevelEncryptionProfileList = fieldLevelEncryptionProfileList;
    }

    /**
     * <p>
     * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @return Returns a list of the field-level encryption profiles that have been created in CloudFront for this
     *         account.
     */

    public FieldLevelEncryptionProfileList getFieldLevelEncryptionProfileList() {
        return this.fieldLevelEncryptionProfileList;
    }

    /**
     * <p>
     * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileList
     *        Returns a list of the field-level encryption profiles that have been created in CloudFront for this
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldLevelEncryptionProfilesResult withFieldLevelEncryptionProfileList(FieldLevelEncryptionProfileList fieldLevelEncryptionProfileList) {
        setFieldLevelEncryptionProfileList(fieldLevelEncryptionProfileList);
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
        if (getFieldLevelEncryptionProfileList() != null)
            sb.append("FieldLevelEncryptionProfileList: ").append(getFieldLevelEncryptionProfileList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFieldLevelEncryptionProfilesResult == false)
            return false;
        ListFieldLevelEncryptionProfilesResult other = (ListFieldLevelEncryptionProfilesResult) obj;
        if (other.getFieldLevelEncryptionProfileList() == null ^ this.getFieldLevelEncryptionProfileList() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileList() != null
                && other.getFieldLevelEncryptionProfileList().equals(this.getFieldLevelEncryptionProfileList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfileList() == null) ? 0 : getFieldLevelEncryptionProfileList().hashCode());
        return hashCode;
    }

    @Override
    public ListFieldLevelEncryptionProfilesResult clone() {
        try {
            return (ListFieldLevelEncryptionProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
