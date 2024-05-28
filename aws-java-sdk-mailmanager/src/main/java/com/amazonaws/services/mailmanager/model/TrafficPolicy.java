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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of a traffic policy resource which is a container for policy statements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/TrafficPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * A user-friendly name of the traffic policy resource.
     * </p>
     */
    private String trafficPolicyName;

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @see AcceptAction
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @return Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *         (or not addressed by) the conditions of your policy statements
     * @see AcceptAction
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public TrafficPolicy withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public TrafficPolicy withDefaultAction(AcceptAction defaultAction) {
        this.defaultAction = defaultAction.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @return The identifier of the traffic policy resource.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyName
     *        A user-friendly name of the traffic policy resource.
     */

    public void setTrafficPolicyName(String trafficPolicyName) {
        this.trafficPolicyName = trafficPolicyName;
    }

    /**
     * <p>
     * A user-friendly name of the traffic policy resource.
     * </p>
     * 
     * @return A user-friendly name of the traffic policy resource.
     */

    public String getTrafficPolicyName() {
        return this.trafficPolicyName;
    }

    /**
     * <p>
     * A user-friendly name of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyName
     *        A user-friendly name of the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withTrafficPolicyName(String trafficPolicyName) {
        setTrafficPolicyName(trafficPolicyName);
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
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId()).append(",");
        if (getTrafficPolicyName() != null)
            sb.append("TrafficPolicyName: ").append(getTrafficPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicy == false)
            return false;
        TrafficPolicy other = (TrafficPolicy) obj;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyName() == null ^ this.getTrafficPolicyName() == null)
            return false;
        if (other.getTrafficPolicyName() != null && other.getTrafficPolicyName().equals(this.getTrafficPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyName() == null) ? 0 : getTrafficPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicy clone() {
        try {
            return (TrafficPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.TrafficPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
