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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateReplicationSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An action to add or delete a Region.
     * </p>
     */
    private java.util.List<UpdateReplicationSetAction> actions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication set you're updating.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * An action to add or delete a Region.
     * </p>
     * 
     * @return An action to add or delete a Region.
     */

    public java.util.List<UpdateReplicationSetAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * An action to add or delete a Region.
     * </p>
     * 
     * @param actions
     *        An action to add or delete a Region.
     */

    public void setActions(java.util.Collection<UpdateReplicationSetAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<UpdateReplicationSetAction>(actions);
    }

    /**
     * <p>
     * An action to add or delete a Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        An action to add or delete a Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetRequest withActions(UpdateReplicationSetAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<UpdateReplicationSetAction>(actions.length));
        }
        for (UpdateReplicationSetAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An action to add or delete a Region.
     * </p>
     * 
     * @param actions
     *        An action to add or delete a Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetRequest withActions(java.util.Collection<UpdateReplicationSetAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication set you're updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the replication set you're updating.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication set you're updating.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication set you're updating.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication set you're updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the replication set you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReplicationSetRequest == false)
            return false;
        UpdateReplicationSetRequest other = (UpdateReplicationSetRequest) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationSetRequest clone() {
        return (UpdateReplicationSetRequest) super.clone();
    }

}
