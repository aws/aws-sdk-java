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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the tag keys to deregister for the current Region. You can either specify individual tag keys or
 * deregister all tag keys in the current Region. You must specify either <code>IncludeAllTagsOfInstance</code> or
 * <code>InstanceTagKeys</code> in the request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterInstanceTagAttributeRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterInstanceTagAttributeRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to deregister all
     * tag keys.
     * </p>
     */
    private Boolean includeAllTagsOfInstance;
    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceTagKeys;

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to deregister all
     * tag keys.
     * </p>
     * 
     * @param includeAllTagsOfInstance
     *        Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to
     *        deregister all tag keys.
     */

    public void setIncludeAllTagsOfInstance(Boolean includeAllTagsOfInstance) {
        this.includeAllTagsOfInstance = includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to deregister all
     * tag keys.
     * </p>
     * 
     * @return Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to
     *         deregister all tag keys.
     */

    public Boolean getIncludeAllTagsOfInstance() {
        return this.includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to deregister all
     * tag keys.
     * </p>
     * 
     * @param includeAllTagsOfInstance
     *        Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to
     *        deregister all tag keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterInstanceTagAttributeRequest withIncludeAllTagsOfInstance(Boolean includeAllTagsOfInstance) {
        setIncludeAllTagsOfInstance(includeAllTagsOfInstance);
        return this;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to deregister all
     * tag keys.
     * </p>
     * 
     * @return Indicates whether to deregister all tag keys in the current Region. Specify <code>false</code> to
     *         deregister all tag keys.
     */

    public Boolean isIncludeAllTagsOfInstance() {
        return this.includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @return Information about the tag keys to deregister.
     */

    public java.util.List<String> getInstanceTagKeys() {
        if (instanceTagKeys == null) {
            instanceTagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceTagKeys;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @param instanceTagKeys
     *        Information about the tag keys to deregister.
     */

    public void setInstanceTagKeys(java.util.Collection<String> instanceTagKeys) {
        if (instanceTagKeys == null) {
            this.instanceTagKeys = null;
            return;
        }

        this.instanceTagKeys = new com.amazonaws.internal.SdkInternalList<String>(instanceTagKeys);
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTagKeys(java.util.Collection)} or {@link #withInstanceTagKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceTagKeys
     *        Information about the tag keys to deregister.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterInstanceTagAttributeRequest withInstanceTagKeys(String... instanceTagKeys) {
        if (this.instanceTagKeys == null) {
            setInstanceTagKeys(new com.amazonaws.internal.SdkInternalList<String>(instanceTagKeys.length));
        }
        for (String ele : instanceTagKeys) {
            this.instanceTagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @param instanceTagKeys
     *        Information about the tag keys to deregister.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterInstanceTagAttributeRequest withInstanceTagKeys(java.util.Collection<String> instanceTagKeys) {
        setInstanceTagKeys(instanceTagKeys);
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
        if (getIncludeAllTagsOfInstance() != null)
            sb.append("IncludeAllTagsOfInstance: ").append(getIncludeAllTagsOfInstance()).append(",");
        if (getInstanceTagKeys() != null)
            sb.append("InstanceTagKeys: ").append(getInstanceTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstanceTagAttributeRequest == false)
            return false;
        DeregisterInstanceTagAttributeRequest other = (DeregisterInstanceTagAttributeRequest) obj;
        if (other.getIncludeAllTagsOfInstance() == null ^ this.getIncludeAllTagsOfInstance() == null)
            return false;
        if (other.getIncludeAllTagsOfInstance() != null && other.getIncludeAllTagsOfInstance().equals(this.getIncludeAllTagsOfInstance()) == false)
            return false;
        if (other.getInstanceTagKeys() == null ^ this.getInstanceTagKeys() == null)
            return false;
        if (other.getInstanceTagKeys() != null && other.getInstanceTagKeys().equals(this.getInstanceTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeAllTagsOfInstance() == null) ? 0 : getIncludeAllTagsOfInstance().hashCode());
        hashCode = prime * hashCode + ((getInstanceTagKeys() == null) ? 0 : getInstanceTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterInstanceTagAttributeRequest clone() {
        try {
            return (DeregisterInstanceTagAttributeRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
