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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrialRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * 
     * @param trialName
     *        The name of the trial to update.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * 
     * @return The name of the trial to update.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * 
     * @param trialName
     *        The name of the trial to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialRequest withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *        specified, <code>TrialName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @return The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *         specified, <code>TrialName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *        specified, <code>TrialName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrialRequest == false)
            return false;
        UpdateTrialRequest other = (UpdateTrialRequest) obj;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrialRequest clone() {
        return (UpdateTrialRequest) super.clone();
    }

}
