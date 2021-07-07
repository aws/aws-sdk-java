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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UntagInstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagInstanceProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM instance profile from which you want to remove tags.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified
     * instance profile.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * The name of the IAM instance profile from which you want to remove tags.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the IAM instance profile from which you want to remove tags.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the IAM instance profile from which you want to remove tags.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the IAM instance profile from which you want to remove tags.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name of the IAM instance profile from which you want to remove tags.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the IAM instance profile from which you want to remove tags.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagInstanceProfileRequest withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified
     * instance profile.
     * </p>
     * 
     * @return A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *         specified instance profile.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified
     * instance profile.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified instance profile.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified
     * instance profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagInstanceProfileRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified
     * instance profile.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagInstanceProfileRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagInstanceProfileRequest == false)
            return false;
        UntagInstanceProfileRequest other = (UntagInstanceProfileRequest) obj;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagInstanceProfileRequest clone() {
        return (UntagInstanceProfileRequest) super.clone();
    }

}
