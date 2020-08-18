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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the action of suppression list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SuppressionListDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressionListDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action that you want to perform on the address. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the suppression list.
     * </p>
     * </li>
     * </ul>
     */
    private String suppressionListImportAction;

    /**
     * <p>
     * The type of action that you want to perform on the address. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the suppression list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressionListImportAction
     *        The type of action that you want to perform on the address. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the suppression list. If the record already exists, it will override it with the
     *        new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the suppression list.
     *        </p>
     *        </li>
     * @see SuppressionListImportAction
     */

    public void setSuppressionListImportAction(String suppressionListImportAction) {
        this.suppressionListImportAction = suppressionListImportAction;
    }

    /**
     * <p>
     * The type of action that you want to perform on the address. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the suppression list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of action that you want to perform on the address. Acceptable values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT: add the addresses to the suppression list. If the record already exists, it will override it with
     *         the new value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE: remove the addresses from the suppression list.
     *         </p>
     *         </li>
     * @see SuppressionListImportAction
     */

    public String getSuppressionListImportAction() {
        return this.suppressionListImportAction;
    }

    /**
     * <p>
     * The type of action that you want to perform on the address. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the suppression list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressionListImportAction
     *        The type of action that you want to perform on the address. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the suppression list. If the record already exists, it will override it with the
     *        new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the suppression list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListImportAction
     */

    public SuppressionListDestination withSuppressionListImportAction(String suppressionListImportAction) {
        setSuppressionListImportAction(suppressionListImportAction);
        return this;
    }

    /**
     * <p>
     * The type of action that you want to perform on the address. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the suppression list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param suppressionListImportAction
     *        The type of action that you want to perform on the address. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the suppression list. If the record already exists, it will override it with the
     *        new value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the suppression list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListImportAction
     */

    public SuppressionListDestination withSuppressionListImportAction(SuppressionListImportAction suppressionListImportAction) {
        this.suppressionListImportAction = suppressionListImportAction.toString();
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
        if (getSuppressionListImportAction() != null)
            sb.append("SuppressionListImportAction: ").append(getSuppressionListImportAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressionListDestination == false)
            return false;
        SuppressionListDestination other = (SuppressionListDestination) obj;
        if (other.getSuppressionListImportAction() == null ^ this.getSuppressionListImportAction() == null)
            return false;
        if (other.getSuppressionListImportAction() != null && other.getSuppressionListImportAction().equals(this.getSuppressionListImportAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuppressionListImportAction() == null) ? 0 : getSuppressionListImportAction().hashCode());
        return hashCode;
    }

    @Override
    public SuppressionListDestination clone() {
        try {
            return (SuppressionListDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SuppressionListDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
