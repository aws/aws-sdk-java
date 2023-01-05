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
 * The URL operation that opens a link to another webpage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomActionURLOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomActionURLOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * THe URL link of the <code>CustomActionURLOperation</code>.
     * </p>
     */
    private String uRLTemplate;
    /**
     * <p>
     * The target of the <code>CustomActionURLOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     * </p>
     * </li>
     * </ul>
     */
    private String uRLTarget;

    /**
     * <p>
     * THe URL link of the <code>CustomActionURLOperation</code>.
     * </p>
     * 
     * @param uRLTemplate
     *        THe URL link of the <code>CustomActionURLOperation</code>.
     */

    public void setURLTemplate(String uRLTemplate) {
        this.uRLTemplate = uRLTemplate;
    }

    /**
     * <p>
     * THe URL link of the <code>CustomActionURLOperation</code>.
     * </p>
     * 
     * @return THe URL link of the <code>CustomActionURLOperation</code>.
     */

    public String getURLTemplate() {
        return this.uRLTemplate;
    }

    /**
     * <p>
     * THe URL link of the <code>CustomActionURLOperation</code>.
     * </p>
     * 
     * @param uRLTemplate
     *        THe URL link of the <code>CustomActionURLOperation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomActionURLOperation withURLTemplate(String uRLTemplate) {
        setURLTemplate(uRLTemplate);
        return this;
    }

    /**
     * <p>
     * The target of the <code>CustomActionURLOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     * </p>
     * </li>
     * </ul>
     * 
     * @param uRLTarget
     *        The target of the <code>CustomActionURLOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     *        </p>
     *        </li>
     * @see URLTargetConfiguration
     */

    public void setURLTarget(String uRLTarget) {
        this.uRLTarget = uRLTarget;
    }

    /**
     * <p>
     * The target of the <code>CustomActionURLOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target of the <code>CustomActionURLOperation</code>.</p>
     *         <p>
     *         Valid values are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     *         </p>
     *         </li>
     * @see URLTargetConfiguration
     */

    public String getURLTarget() {
        return this.uRLTarget;
    }

    /**
     * <p>
     * The target of the <code>CustomActionURLOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     * </p>
     * </li>
     * </ul>
     * 
     * @param uRLTarget
     *        The target of the <code>CustomActionURLOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see URLTargetConfiguration
     */

    public CustomActionURLOperation withURLTarget(String uRLTarget) {
        setURLTarget(uRLTarget);
        return this;
    }

    /**
     * <p>
     * The target of the <code>CustomActionURLOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     * </p>
     * </li>
     * </ul>
     * 
     * @param uRLTarget
     *        The target of the <code>CustomActionURLOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW_TAB</code>: Opens the target URL in a new browser tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_WINDOW</code>: Opens the target URL in a new browser window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAME_TAB</code>: Opens the target URL in the same browser tab.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see URLTargetConfiguration
     */

    public CustomActionURLOperation withURLTarget(URLTargetConfiguration uRLTarget) {
        this.uRLTarget = uRLTarget.toString();
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
        if (getURLTemplate() != null)
            sb.append("URLTemplate: ").append(getURLTemplate()).append(",");
        if (getURLTarget() != null)
            sb.append("URLTarget: ").append(getURLTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomActionURLOperation == false)
            return false;
        CustomActionURLOperation other = (CustomActionURLOperation) obj;
        if (other.getURLTemplate() == null ^ this.getURLTemplate() == null)
            return false;
        if (other.getURLTemplate() != null && other.getURLTemplate().equals(this.getURLTemplate()) == false)
            return false;
        if (other.getURLTarget() == null ^ this.getURLTarget() == null)
            return false;
        if (other.getURLTarget() != null && other.getURLTarget().equals(this.getURLTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getURLTemplate() == null) ? 0 : getURLTemplate().hashCode());
        hashCode = prime * hashCode + ((getURLTarget() == null) ? 0 : getURLTarget().hashCode());
        return hashCode;
    }

    @Override
    public CustomActionURLOperation clone() {
        try {
            return (CustomActionURLOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomActionURLOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
