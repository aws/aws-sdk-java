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
 * The navigation configuration for <code>CustomActionNavigationOperation</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LocalNavigationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalNavigationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sheet that is targeted for navigation in the same analysis.
     * </p>
     */
    private String targetSheetId;

    /**
     * <p>
     * The sheet that is targeted for navigation in the same analysis.
     * </p>
     * 
     * @param targetSheetId
     *        The sheet that is targeted for navigation in the same analysis.
     */

    public void setTargetSheetId(String targetSheetId) {
        this.targetSheetId = targetSheetId;
    }

    /**
     * <p>
     * The sheet that is targeted for navigation in the same analysis.
     * </p>
     * 
     * @return The sheet that is targeted for navigation in the same analysis.
     */

    public String getTargetSheetId() {
        return this.targetSheetId;
    }

    /**
     * <p>
     * The sheet that is targeted for navigation in the same analysis.
     * </p>
     * 
     * @param targetSheetId
     *        The sheet that is targeted for navigation in the same analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalNavigationConfiguration withTargetSheetId(String targetSheetId) {
        setTargetSheetId(targetSheetId);
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
        if (getTargetSheetId() != null)
            sb.append("TargetSheetId: ").append(getTargetSheetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalNavigationConfiguration == false)
            return false;
        LocalNavigationConfiguration other = (LocalNavigationConfiguration) obj;
        if (other.getTargetSheetId() == null ^ this.getTargetSheetId() == null)
            return false;
        if (other.getTargetSheetId() != null && other.getTargetSheetId().equals(this.getTargetSheetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetSheetId() == null) ? 0 : getTargetSheetId().hashCode());
        return hashCode;
    }

    @Override
    public LocalNavigationConfiguration clone() {
        try {
            return (LocalNavigationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LocalNavigationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
