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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>controlSet</code> entity that represents a collection of controls in AWS Audit Manager. This does not contain
 * the control set ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFrameworkControlSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentFrameworkControlSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the specified control set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of controls within the control set. This does not contain the control set ID.
     * </p>
     */
    private java.util.List<CreateAssessmentFrameworkControl> controls;

    /**
     * <p>
     * The name of the specified control set.
     * </p>
     * 
     * @param name
     *        The name of the specified control set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified control set.
     * </p>
     * 
     * @return The name of the specified control set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified control set.
     * </p>
     * 
     * @param name
     *        The name of the specified control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkControlSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of controls within the control set. This does not contain the control set ID.
     * </p>
     * 
     * @return The list of controls within the control set. This does not contain the control set ID.
     */

    public java.util.List<CreateAssessmentFrameworkControl> getControls() {
        return controls;
    }

    /**
     * <p>
     * The list of controls within the control set. This does not contain the control set ID.
     * </p>
     * 
     * @param controls
     *        The list of controls within the control set. This does not contain the control set ID.
     */

    public void setControls(java.util.Collection<CreateAssessmentFrameworkControl> controls) {
        if (controls == null) {
            this.controls = null;
            return;
        }

        this.controls = new java.util.ArrayList<CreateAssessmentFrameworkControl>(controls);
    }

    /**
     * <p>
     * The list of controls within the control set. This does not contain the control set ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControls(java.util.Collection)} or {@link #withControls(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param controls
     *        The list of controls within the control set. This does not contain the control set ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkControlSet withControls(CreateAssessmentFrameworkControl... controls) {
        if (this.controls == null) {
            setControls(new java.util.ArrayList<CreateAssessmentFrameworkControl>(controls.length));
        }
        for (CreateAssessmentFrameworkControl ele : controls) {
            this.controls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of controls within the control set. This does not contain the control set ID.
     * </p>
     * 
     * @param controls
     *        The list of controls within the control set. This does not contain the control set ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkControlSet withControls(java.util.Collection<CreateAssessmentFrameworkControl> controls) {
        setControls(controls);
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
        if (getControls() != null)
            sb.append("Controls: ").append(getControls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentFrameworkControlSet == false)
            return false;
        CreateAssessmentFrameworkControlSet other = (CreateAssessmentFrameworkControlSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getControls() == null ^ this.getControls() == null)
            return false;
        if (other.getControls() != null && other.getControls().equals(this.getControls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getControls() == null) ? 0 : getControls().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentFrameworkControlSet clone() {
        try {
            return (CreateAssessmentFrameworkControlSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.CreateAssessmentFrameworkControlSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
