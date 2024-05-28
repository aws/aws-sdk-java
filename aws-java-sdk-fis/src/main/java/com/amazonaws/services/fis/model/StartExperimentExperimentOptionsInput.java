/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies experiment options for running an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperimentExperimentOptionsInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExperimentExperimentOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the actions mode for experiment options.
     * </p>
     */
    private String actionsMode;

    /**
     * <p>
     * Specifies the actions mode for experiment options.
     * </p>
     * 
     * @param actionsMode
     *        Specifies the actions mode for experiment options.
     * @see ActionsMode
     */

    public void setActionsMode(String actionsMode) {
        this.actionsMode = actionsMode;
    }

    /**
     * <p>
     * Specifies the actions mode for experiment options.
     * </p>
     * 
     * @return Specifies the actions mode for experiment options.
     * @see ActionsMode
     */

    public String getActionsMode() {
        return this.actionsMode;
    }

    /**
     * <p>
     * Specifies the actions mode for experiment options.
     * </p>
     * 
     * @param actionsMode
     *        Specifies the actions mode for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionsMode
     */

    public StartExperimentExperimentOptionsInput withActionsMode(String actionsMode) {
        setActionsMode(actionsMode);
        return this;
    }

    /**
     * <p>
     * Specifies the actions mode for experiment options.
     * </p>
     * 
     * @param actionsMode
     *        Specifies the actions mode for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionsMode
     */

    public StartExperimentExperimentOptionsInput withActionsMode(ActionsMode actionsMode) {
        this.actionsMode = actionsMode.toString();
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
        if (getActionsMode() != null)
            sb.append("ActionsMode: ").append(getActionsMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExperimentExperimentOptionsInput == false)
            return false;
        StartExperimentExperimentOptionsInput other = (StartExperimentExperimentOptionsInput) obj;
        if (other.getActionsMode() == null ^ this.getActionsMode() == null)
            return false;
        if (other.getActionsMode() != null && other.getActionsMode().equals(this.getActionsMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionsMode() == null) ? 0 : getActionsMode().hashCode());
        return hashCode;
    }

    @Override
    public StartExperimentExperimentOptionsInput clone() {
        try {
            return (StartExperimentExperimentOptionsInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.StartExperimentExperimentOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
