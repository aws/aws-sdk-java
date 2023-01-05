/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The operation that is defined by the custom action.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VisualCustomActionOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualCustomActionOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter operation that filters data included in a visual or in an entire sheet.
     * </p>
     */
    private CustomActionFilterOperation filterOperation;
    /**
     * <p>
     * The navigation operation that navigates between different sheets in the same analysis.
     * </p>
     */
    private CustomActionNavigationOperation navigationOperation;
    /**
     * <p>
     * The URL operation that opens a link to another webpage.
     * </p>
     */
    private CustomActionURLOperation uRLOperation;
    /**
     * <p>
     * The set parameter operation that sets parameters in custom action.
     * </p>
     */
    private CustomActionSetParametersOperation setParametersOperation;

    /**
     * <p>
     * The filter operation that filters data included in a visual or in an entire sheet.
     * </p>
     * 
     * @param filterOperation
     *        The filter operation that filters data included in a visual or in an entire sheet.
     */

    public void setFilterOperation(CustomActionFilterOperation filterOperation) {
        this.filterOperation = filterOperation;
    }

    /**
     * <p>
     * The filter operation that filters data included in a visual or in an entire sheet.
     * </p>
     * 
     * @return The filter operation that filters data included in a visual or in an entire sheet.
     */

    public CustomActionFilterOperation getFilterOperation() {
        return this.filterOperation;
    }

    /**
     * <p>
     * The filter operation that filters data included in a visual or in an entire sheet.
     * </p>
     * 
     * @param filterOperation
     *        The filter operation that filters data included in a visual or in an entire sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomActionOperation withFilterOperation(CustomActionFilterOperation filterOperation) {
        setFilterOperation(filterOperation);
        return this;
    }

    /**
     * <p>
     * The navigation operation that navigates between different sheets in the same analysis.
     * </p>
     * 
     * @param navigationOperation
     *        The navigation operation that navigates between different sheets in the same analysis.
     */

    public void setNavigationOperation(CustomActionNavigationOperation navigationOperation) {
        this.navigationOperation = navigationOperation;
    }

    /**
     * <p>
     * The navigation operation that navigates between different sheets in the same analysis.
     * </p>
     * 
     * @return The navigation operation that navigates between different sheets in the same analysis.
     */

    public CustomActionNavigationOperation getNavigationOperation() {
        return this.navigationOperation;
    }

    /**
     * <p>
     * The navigation operation that navigates between different sheets in the same analysis.
     * </p>
     * 
     * @param navigationOperation
     *        The navigation operation that navigates between different sheets in the same analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomActionOperation withNavigationOperation(CustomActionNavigationOperation navigationOperation) {
        setNavigationOperation(navigationOperation);
        return this;
    }

    /**
     * <p>
     * The URL operation that opens a link to another webpage.
     * </p>
     * 
     * @param uRLOperation
     *        The URL operation that opens a link to another webpage.
     */

    public void setURLOperation(CustomActionURLOperation uRLOperation) {
        this.uRLOperation = uRLOperation;
    }

    /**
     * <p>
     * The URL operation that opens a link to another webpage.
     * </p>
     * 
     * @return The URL operation that opens a link to another webpage.
     */

    public CustomActionURLOperation getURLOperation() {
        return this.uRLOperation;
    }

    /**
     * <p>
     * The URL operation that opens a link to another webpage.
     * </p>
     * 
     * @param uRLOperation
     *        The URL operation that opens a link to another webpage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomActionOperation withURLOperation(CustomActionURLOperation uRLOperation) {
        setURLOperation(uRLOperation);
        return this;
    }

    /**
     * <p>
     * The set parameter operation that sets parameters in custom action.
     * </p>
     * 
     * @param setParametersOperation
     *        The set parameter operation that sets parameters in custom action.
     */

    public void setSetParametersOperation(CustomActionSetParametersOperation setParametersOperation) {
        this.setParametersOperation = setParametersOperation;
    }

    /**
     * <p>
     * The set parameter operation that sets parameters in custom action.
     * </p>
     * 
     * @return The set parameter operation that sets parameters in custom action.
     */

    public CustomActionSetParametersOperation getSetParametersOperation() {
        return this.setParametersOperation;
    }

    /**
     * <p>
     * The set parameter operation that sets parameters in custom action.
     * </p>
     * 
     * @param setParametersOperation
     *        The set parameter operation that sets parameters in custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomActionOperation withSetParametersOperation(CustomActionSetParametersOperation setParametersOperation) {
        setSetParametersOperation(setParametersOperation);
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
        if (getFilterOperation() != null)
            sb.append("FilterOperation: ").append(getFilterOperation()).append(",");
        if (getNavigationOperation() != null)
            sb.append("NavigationOperation: ").append(getNavigationOperation()).append(",");
        if (getURLOperation() != null)
            sb.append("URLOperation: ").append(getURLOperation()).append(",");
        if (getSetParametersOperation() != null)
            sb.append("SetParametersOperation: ").append(getSetParametersOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualCustomActionOperation == false)
            return false;
        VisualCustomActionOperation other = (VisualCustomActionOperation) obj;
        if (other.getFilterOperation() == null ^ this.getFilterOperation() == null)
            return false;
        if (other.getFilterOperation() != null && other.getFilterOperation().equals(this.getFilterOperation()) == false)
            return false;
        if (other.getNavigationOperation() == null ^ this.getNavigationOperation() == null)
            return false;
        if (other.getNavigationOperation() != null && other.getNavigationOperation().equals(this.getNavigationOperation()) == false)
            return false;
        if (other.getURLOperation() == null ^ this.getURLOperation() == null)
            return false;
        if (other.getURLOperation() != null && other.getURLOperation().equals(this.getURLOperation()) == false)
            return false;
        if (other.getSetParametersOperation() == null ^ this.getSetParametersOperation() == null)
            return false;
        if (other.getSetParametersOperation() != null && other.getSetParametersOperation().equals(this.getSetParametersOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterOperation() == null) ? 0 : getFilterOperation().hashCode());
        hashCode = prime * hashCode + ((getNavigationOperation() == null) ? 0 : getNavigationOperation().hashCode());
        hashCode = prime * hashCode + ((getURLOperation() == null) ? 0 : getURLOperation().hashCode());
        hashCode = prime * hashCode + ((getSetParametersOperation() == null) ? 0 : getSetParametersOperation().hashCode());
        return hashCode;
    }

    @Override
    public VisualCustomActionOperation clone() {
        try {
            return (VisualCustomActionOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualCustomActionOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
