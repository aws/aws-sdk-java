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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a rule for copying shared snapshots across Regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CrossRegionCopyAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossRegionCopyAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target Region.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The encryption settings for the copied snapshot.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    private CrossRegionCopyRetainRule retainRule;

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param target
     *        The target Region.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @return The target Region.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param target
     *        The target Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyAction withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The encryption settings for the copied snapshot.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption settings for the copied snapshot.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption settings for the copied snapshot.
     * </p>
     * 
     * @return The encryption settings for the copied snapshot.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption settings for the copied snapshot.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption settings for the copied snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyAction withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * @param retainRule
     */

    public void setRetainRule(CrossRegionCopyRetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * @return
     */

    public CrossRegionCopyRetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * @param retainRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyAction withRetainRule(CrossRegionCopyRetainRule retainRule) {
        setRetainRule(retainRule);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getRetainRule() != null)
            sb.append("RetainRule: ").append(getRetainRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossRegionCopyAction == false)
            return false;
        CrossRegionCopyAction other = (CrossRegionCopyAction) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        return hashCode;
    }

    @Override
    public CrossRegionCopyAction clone() {
        try {
            return (CrossRegionCopyAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.CrossRegionCopyActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
