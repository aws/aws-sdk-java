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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeScreenAutomationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated workbook cursor after performing the automation action.
     * </p>
     */
    private Long workbookCursor;

    /**
     * <p>
     * The updated workbook cursor after performing the automation action.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after performing the automation action.
     */

    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after performing the automation action.
     * </p>
     * 
     * @return The updated workbook cursor after performing the automation action.
     */

    public Long getWorkbookCursor() {
        return this.workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after performing the automation action.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after performing the automation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationResult withWorkbookCursor(Long workbookCursor) {
        setWorkbookCursor(workbookCursor);
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
        if (getWorkbookCursor() != null)
            sb.append("WorkbookCursor: ").append(getWorkbookCursor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeScreenAutomationResult == false)
            return false;
        InvokeScreenAutomationResult other = (InvokeScreenAutomationResult) obj;
        if (other.getWorkbookCursor() == null ^ this.getWorkbookCursor() == null)
            return false;
        if (other.getWorkbookCursor() != null && other.getWorkbookCursor().equals(this.getWorkbookCursor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        return hashCode;
    }

    @Override
    public InvokeScreenAutomationResult clone() {
        try {
            return (InvokeScreenAutomationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
