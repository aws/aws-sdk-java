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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCreateCaseOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCreateCaseOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Language availability can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * available
     * </p>
     * </li>
     * <li>
     * <p>
     * best_effort
     * </p>
     * </li>
     * <li>
     * <p>
     * unavailable
     * </p>
     * </li>
     * </ul>
     */
    private String languageAvailability;
    /**
     * <p>
     * A JSON-formatted array that contains the available communication type options, along with the available support
     * timeframes for the given inputs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CommunicationTypeOptions> communicationTypes;

    /**
     * <p>
     * Language availability can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * available
     * </p>
     * </li>
     * <li>
     * <p>
     * best_effort
     * </p>
     * </li>
     * <li>
     * <p>
     * unavailable
     * </p>
     * </li>
     * </ul>
     * 
     * @param languageAvailability
     *        Language availability can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        available
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        best_effort
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        unavailable
     *        </p>
     *        </li>
     */

    public void setLanguageAvailability(String languageAvailability) {
        this.languageAvailability = languageAvailability;
    }

    /**
     * <p>
     * Language availability can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * available
     * </p>
     * </li>
     * <li>
     * <p>
     * best_effort
     * </p>
     * </li>
     * <li>
     * <p>
     * unavailable
     * </p>
     * </li>
     * </ul>
     * 
     * @return Language availability can be any of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         available
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         best_effort
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         unavailable
     *         </p>
     *         </li>
     */

    public String getLanguageAvailability() {
        return this.languageAvailability;
    }

    /**
     * <p>
     * Language availability can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * available
     * </p>
     * </li>
     * <li>
     * <p>
     * best_effort
     * </p>
     * </li>
     * <li>
     * <p>
     * unavailable
     * </p>
     * </li>
     * </ul>
     * 
     * @param languageAvailability
     *        Language availability can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        available
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        best_effort
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        unavailable
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsResult withLanguageAvailability(String languageAvailability) {
        setLanguageAvailability(languageAvailability);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available communication type options, along with the available support
     * timeframes for the given inputs.
     * </p>
     * 
     * @return A JSON-formatted array that contains the available communication type options, along with the available
     *         support timeframes for the given inputs.
     */

    public java.util.List<CommunicationTypeOptions> getCommunicationTypes() {
        if (communicationTypes == null) {
            communicationTypes = new com.amazonaws.internal.SdkInternalList<CommunicationTypeOptions>();
        }
        return communicationTypes;
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available communication type options, along with the available support
     * timeframes for the given inputs.
     * </p>
     * 
     * @param communicationTypes
     *        A JSON-formatted array that contains the available communication type options, along with the available
     *        support timeframes for the given inputs.
     */

    public void setCommunicationTypes(java.util.Collection<CommunicationTypeOptions> communicationTypes) {
        if (communicationTypes == null) {
            this.communicationTypes = null;
            return;
        }

        this.communicationTypes = new com.amazonaws.internal.SdkInternalList<CommunicationTypeOptions>(communicationTypes);
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available communication type options, along with the available support
     * timeframes for the given inputs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommunicationTypes(java.util.Collection)} or {@link #withCommunicationTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param communicationTypes
     *        A JSON-formatted array that contains the available communication type options, along with the available
     *        support timeframes for the given inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsResult withCommunicationTypes(CommunicationTypeOptions... communicationTypes) {
        if (this.communicationTypes == null) {
            setCommunicationTypes(new com.amazonaws.internal.SdkInternalList<CommunicationTypeOptions>(communicationTypes.length));
        }
        for (CommunicationTypeOptions ele : communicationTypes) {
            this.communicationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available communication type options, along with the available support
     * timeframes for the given inputs.
     * </p>
     * 
     * @param communicationTypes
     *        A JSON-formatted array that contains the available communication type options, along with the available
     *        support timeframes for the given inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsResult withCommunicationTypes(java.util.Collection<CommunicationTypeOptions> communicationTypes) {
        setCommunicationTypes(communicationTypes);
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
        if (getLanguageAvailability() != null)
            sb.append("LanguageAvailability: ").append(getLanguageAvailability()).append(",");
        if (getCommunicationTypes() != null)
            sb.append("CommunicationTypes: ").append(getCommunicationTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCreateCaseOptionsResult == false)
            return false;
        DescribeCreateCaseOptionsResult other = (DescribeCreateCaseOptionsResult) obj;
        if (other.getLanguageAvailability() == null ^ this.getLanguageAvailability() == null)
            return false;
        if (other.getLanguageAvailability() != null && other.getLanguageAvailability().equals(this.getLanguageAvailability()) == false)
            return false;
        if (other.getCommunicationTypes() == null ^ this.getCommunicationTypes() == null)
            return false;
        if (other.getCommunicationTypes() != null && other.getCommunicationTypes().equals(this.getCommunicationTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageAvailability() == null) ? 0 : getLanguageAvailability().hashCode());
        hashCode = prime * hashCode + ((getCommunicationTypes() == null) ? 0 : getCommunicationTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCreateCaseOptionsResult clone() {
        try {
            return (DescribeCreateCaseOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
