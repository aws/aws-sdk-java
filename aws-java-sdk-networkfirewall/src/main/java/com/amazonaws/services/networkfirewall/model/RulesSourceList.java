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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stateful inspection criteria for a domain list rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RulesSourceList" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesSourceList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with
     * commas.
     * </p>
     */
    private java.util.List<String> targets;
    /** <p/> */
    private java.util.List<String> targetTypes;
    /**
     * <p>
     * Whether you want to allow or deny access to the domains in your target list.
     * </p>
     */
    private String generatedRulesType;

    /**
     * <p>
     * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with
     * commas.
     * </p>
     * 
     * @return The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate
     *         them with commas.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with
     * commas.
     * </p>
     * 
     * @param targets
     *        The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them
     *        with commas.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with
     * commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them
     *        with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSourceList withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with
     * commas.
     * </p>
     * 
     * @param targets
     *        The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them
     *        with commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSourceList withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     * @see TargetType
     */

    public java.util.List<String> getTargetTypes() {
        return targetTypes;
    }

    /**
     * <p/>
     * 
     * @param targetTypes
     * @see TargetType
     */

    public void setTargetTypes(java.util.Collection<String> targetTypes) {
        if (targetTypes == null) {
            this.targetTypes = null;
            return;
        }

        this.targetTypes = new java.util.ArrayList<String>(targetTypes);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTypes(java.util.Collection)} or {@link #withTargetTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public RulesSourceList withTargetTypes(String... targetTypes) {
        if (this.targetTypes == null) {
            setTargetTypes(new java.util.ArrayList<String>(targetTypes.length));
        }
        for (String ele : targetTypes) {
            this.targetTypes.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public RulesSourceList withTargetTypes(java.util.Collection<String> targetTypes) {
        setTargetTypes(targetTypes);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public RulesSourceList withTargetTypes(TargetType... targetTypes) {
        java.util.ArrayList<String> targetTypesCopy = new java.util.ArrayList<String>(targetTypes.length);
        for (TargetType value : targetTypes) {
            targetTypesCopy.add(value.toString());
        }
        if (getTargetTypes() == null) {
            setTargetTypes(targetTypesCopy);
        } else {
            getTargetTypes().addAll(targetTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Whether you want to allow or deny access to the domains in your target list.
     * </p>
     * 
     * @param generatedRulesType
     *        Whether you want to allow or deny access to the domains in your target list.
     * @see GeneratedRulesType
     */

    public void setGeneratedRulesType(String generatedRulesType) {
        this.generatedRulesType = generatedRulesType;
    }

    /**
     * <p>
     * Whether you want to allow or deny access to the domains in your target list.
     * </p>
     * 
     * @return Whether you want to allow or deny access to the domains in your target list.
     * @see GeneratedRulesType
     */

    public String getGeneratedRulesType() {
        return this.generatedRulesType;
    }

    /**
     * <p>
     * Whether you want to allow or deny access to the domains in your target list.
     * </p>
     * 
     * @param generatedRulesType
     *        Whether you want to allow or deny access to the domains in your target list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedRulesType
     */

    public RulesSourceList withGeneratedRulesType(String generatedRulesType) {
        setGeneratedRulesType(generatedRulesType);
        return this;
    }

    /**
     * <p>
     * Whether you want to allow or deny access to the domains in your target list.
     * </p>
     * 
     * @param generatedRulesType
     *        Whether you want to allow or deny access to the domains in your target list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedRulesType
     */

    public RulesSourceList withGeneratedRulesType(GeneratedRulesType generatedRulesType) {
        this.generatedRulesType = generatedRulesType.toString();
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTargetTypes() != null)
            sb.append("TargetTypes: ").append(getTargetTypes()).append(",");
        if (getGeneratedRulesType() != null)
            sb.append("GeneratedRulesType: ").append(getGeneratedRulesType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesSourceList == false)
            return false;
        RulesSourceList other = (RulesSourceList) obj;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetTypes() == null ^ this.getTargetTypes() == null)
            return false;
        if (other.getTargetTypes() != null && other.getTargetTypes().equals(this.getTargetTypes()) == false)
            return false;
        if (other.getGeneratedRulesType() == null ^ this.getGeneratedRulesType() == null)
            return false;
        if (other.getGeneratedRulesType() != null && other.getGeneratedRulesType().equals(this.getGeneratedRulesType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetTypes() == null) ? 0 : getTargetTypes().hashCode());
        hashCode = prime * hashCode + ((getGeneratedRulesType() == null) ? 0 : getGeneratedRulesType().hashCode());
        return hashCode;
    }

    @Override
    public RulesSourceList clone() {
        try {
            return (RulesSourceList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RulesSourceListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
