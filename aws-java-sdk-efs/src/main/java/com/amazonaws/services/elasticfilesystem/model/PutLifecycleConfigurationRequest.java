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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutLifecycleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecycleConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object (String).
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file system's
     * <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     * management when to transition files from the Standard storage class to the Infrequent Access storage class.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecyclePolicy> lifecyclePolicies;

    /**
     * <p>
     * The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object (String).
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object
     *        (String).
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object (String).
     * </p>
     * 
     * @return The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object
     *         (String).
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object (String).
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which you are creating the <code>LifecycleConfiguration</code> object
     *        (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleConfigurationRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file system's
     * <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     * management when to transition files from the Standard storage class to the Infrequent Access storage class.
     * </p>
     * 
     * @return An array of <code>LifecyclePolicy</code> objects that define the file system's
     *         <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     *         management when to transition files from the Standard storage class to the Infrequent Access storage
     *         class.
     */

    public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
        if (lifecyclePolicies == null) {
            lifecyclePolicies = new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>();
        }
        return lifecyclePolicies;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file system's
     * <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     * management when to transition files from the Standard storage class to the Infrequent Access storage class.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of <code>LifecyclePolicy</code> objects that define the file system's
     *        <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     *        management when to transition files from the Standard storage class to the Infrequent Access storage
     *        class.
     */

    public void setLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        if (lifecyclePolicies == null) {
            this.lifecyclePolicies = null;
            return;
        }

        this.lifecyclePolicies = new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>(lifecyclePolicies);
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file system's
     * <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     * management when to transition files from the Standard storage class to the Infrequent Access storage class.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecyclePolicies(java.util.Collection)} or {@link #withLifecyclePolicies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of <code>LifecyclePolicy</code> objects that define the file system's
     *        <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     *        management when to transition files from the Standard storage class to the Infrequent Access storage
     *        class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleConfigurationRequest withLifecyclePolicies(LifecyclePolicy... lifecyclePolicies) {
        if (this.lifecyclePolicies == null) {
            setLifecyclePolicies(new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>(lifecyclePolicies.length));
        }
        for (LifecyclePolicy ele : lifecyclePolicies) {
            this.lifecyclePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LifecyclePolicy</code> objects that define the file system's
     * <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     * management when to transition files from the Standard storage class to the Infrequent Access storage class.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of <code>LifecyclePolicy</code> objects that define the file system's
     *        <code>LifecycleConfiguration</code> object. A <code>LifecycleConfiguration</code> object tells lifecycle
     *        management when to transition files from the Standard storage class to the Infrequent Access storage
     *        class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleConfigurationRequest withLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        setLifecyclePolicies(lifecyclePolicies);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLifecyclePolicies() != null)
            sb.append("LifecyclePolicies: ").append(getLifecyclePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleConfigurationRequest == false)
            return false;
        PutLifecycleConfigurationRequest other = (PutLifecycleConfigurationRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecyclePolicies() == null ^ this.getLifecyclePolicies() == null)
            return false;
        if (other.getLifecyclePolicies() != null && other.getLifecyclePolicies().equals(this.getLifecyclePolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicies() == null) ? 0 : getLifecyclePolicies().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecycleConfigurationRequest clone() {
        return (PutLifecycleConfigurationRequest) super.clone();
    }

}
