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
 * The options that determine how a date axis is displayed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DateAxisOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateAxisOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not missing dates are displayed.
     * </p>
     */
    private String missingDateVisibility;

    /**
     * <p>
     * Determines whether or not missing dates are displayed.
     * </p>
     * 
     * @param missingDateVisibility
     *        Determines whether or not missing dates are displayed.
     * @see Visibility
     */

    public void setMissingDateVisibility(String missingDateVisibility) {
        this.missingDateVisibility = missingDateVisibility;
    }

    /**
     * <p>
     * Determines whether or not missing dates are displayed.
     * </p>
     * 
     * @return Determines whether or not missing dates are displayed.
     * @see Visibility
     */

    public String getMissingDateVisibility() {
        return this.missingDateVisibility;
    }

    /**
     * <p>
     * Determines whether or not missing dates are displayed.
     * </p>
     * 
     * @param missingDateVisibility
     *        Determines whether or not missing dates are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DateAxisOptions withMissingDateVisibility(String missingDateVisibility) {
        setMissingDateVisibility(missingDateVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not missing dates are displayed.
     * </p>
     * 
     * @param missingDateVisibility
     *        Determines whether or not missing dates are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DateAxisOptions withMissingDateVisibility(Visibility missingDateVisibility) {
        this.missingDateVisibility = missingDateVisibility.toString();
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
        if (getMissingDateVisibility() != null)
            sb.append("MissingDateVisibility: ").append(getMissingDateVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateAxisOptions == false)
            return false;
        DateAxisOptions other = (DateAxisOptions) obj;
        if (other.getMissingDateVisibility() == null ^ this.getMissingDateVisibility() == null)
            return false;
        if (other.getMissingDateVisibility() != null && other.getMissingDateVisibility().equals(this.getMissingDateVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMissingDateVisibility() == null) ? 0 : getMissingDateVisibility().hashCode());
        return hashCode;
    }

    @Override
    public DateAxisOptions clone() {
        try {
            return (DateAxisOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DateAxisOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
