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
 * The configuration of the search options in a list control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListControlSearchOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlSearchOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility configuration of the search options in a list control.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The visibility configuration of the search options in a list control.
     * </p>
     * 
     * @param visibility
     *        The visibility configuration of the search options in a list control.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility configuration of the search options in a list control.
     * </p>
     * 
     * @return The visibility configuration of the search options in a list control.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility configuration of the search options in a list control.
     * </p>
     * 
     * @param visibility
     *        The visibility configuration of the search options in a list control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ListControlSearchOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility configuration of the search options in a list control.
     * </p>
     * 
     * @param visibility
     *        The visibility configuration of the search options in a list control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ListControlSearchOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListControlSearchOptions == false)
            return false;
        ListControlSearchOptions other = (ListControlSearchOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public ListControlSearchOptions clone() {
        try {
            return (ListControlSearchOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ListControlSearchOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
