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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Sync configuration for a resolver.
 * </p>
 * <p>
 * Contains information on which Conflict Detection as well as Resolution strategy should be performed when the resolver
 * is invoked.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/SyncConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Conflict Resolution strategy to perform in the event of a conflict.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the latest
     * version at the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     * </p>
     * </li>
     * </ul>
     */
    private String conflictHandler;
    /**
     * <p>
     * The Conflict Detection strategy to use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NONE</b>: Do not detect conflicts when executing this resolver.
     * </p>
     * </li>
     * </ul>
     */
    private String conflictDetection;
    /**
     * <p>
     * The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     * </p>
     */
    private LambdaConflictHandlerConfig lambdaConflictHandlerConfig;

    /**
     * <p>
     * The Conflict Resolution strategy to perform in the event of a conflict.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the latest
     * version at the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictHandler
     *        The Conflict Resolution strategy to perform in the event of a conflict.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the
     *        latest version at the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     *        </p>
     *        </li>
     * @see ConflictHandlerType
     */

    public void setConflictHandler(String conflictHandler) {
        this.conflictHandler = conflictHandler;
    }

    /**
     * <p>
     * The Conflict Resolution strategy to perform in the event of a conflict.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the latest
     * version at the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Conflict Resolution strategy to perform in the event of a conflict.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the
     *         latest version at the server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     *         </p>
     *         </li>
     * @see ConflictHandlerType
     */

    public String getConflictHandler() {
        return this.conflictHandler;
    }

    /**
     * <p>
     * The Conflict Resolution strategy to perform in the event of a conflict.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the latest
     * version at the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictHandler
     *        The Conflict Resolution strategy to perform in the event of a conflict.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the
     *        latest version at the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictHandlerType
     */

    public SyncConfig withConflictHandler(String conflictHandler) {
        setConflictHandler(conflictHandler);
        return this;
    }

    /**
     * <p>
     * The Conflict Resolution strategy to perform in the event of a conflict.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the latest
     * version at the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictHandler
     *        The Conflict Resolution strategy to perform in the event of a conflict.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OPTIMISTIC_CONCURRENCY</b>: Resolve conflicts by rejecting mutations when versions do not match the
     *        latest version at the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AUTOMERGE</b>: Resolve conflicts with the Automerge conflict resolution strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LAMBDA</b>: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictHandlerType
     */

    public SyncConfig withConflictHandler(ConflictHandlerType conflictHandler) {
        this.conflictHandler = conflictHandler.toString();
        return this;
    }

    /**
     * <p>
     * The Conflict Detection strategy to use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NONE</b>: Do not detect conflicts when executing this resolver.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictDetection
     *        The Conflict Detection strategy to use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NONE</b>: Do not detect conflicts when executing this resolver.
     *        </p>
     *        </li>
     * @see ConflictDetectionType
     */

    public void setConflictDetection(String conflictDetection) {
        this.conflictDetection = conflictDetection;
    }

    /**
     * <p>
     * The Conflict Detection strategy to use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NONE</b>: Do not detect conflicts when executing this resolver.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Conflict Detection strategy to use.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NONE</b>: Do not detect conflicts when executing this resolver.
     *         </p>
     *         </li>
     * @see ConflictDetectionType
     */

    public String getConflictDetection() {
        return this.conflictDetection;
    }

    /**
     * <p>
     * The Conflict Detection strategy to use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NONE</b>: Do not detect conflicts when executing this resolver.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictDetection
     *        The Conflict Detection strategy to use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NONE</b>: Do not detect conflicts when executing this resolver.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetectionType
     */

    public SyncConfig withConflictDetection(String conflictDetection) {
        setConflictDetection(conflictDetection);
        return this;
    }

    /**
     * <p>
     * The Conflict Detection strategy to use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NONE</b>: Do not detect conflicts when executing this resolver.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictDetection
     *        The Conflict Detection strategy to use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VERSION</b>: Detect conflicts based on object versions for this resolver.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NONE</b>: Do not detect conflicts when executing this resolver.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictDetectionType
     */

    public SyncConfig withConflictDetection(ConflictDetectionType conflictDetection) {
        this.conflictDetection = conflictDetection.toString();
        return this;
    }

    /**
     * <p>
     * The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     * </p>
     * 
     * @param lambdaConflictHandlerConfig
     *        The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     */

    public void setLambdaConflictHandlerConfig(LambdaConflictHandlerConfig lambdaConflictHandlerConfig) {
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    /**
     * <p>
     * The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     * </p>
     * 
     * @return The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     */

    public LambdaConflictHandlerConfig getLambdaConflictHandlerConfig() {
        return this.lambdaConflictHandlerConfig;
    }

    /**
     * <p>
     * The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     * </p>
     * 
     * @param lambdaConflictHandlerConfig
     *        The <code>LambdaConflictHandlerConfig</code> when configuring LAMBDA as the Conflict Handler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncConfig withLambdaConflictHandlerConfig(LambdaConflictHandlerConfig lambdaConflictHandlerConfig) {
        setLambdaConflictHandlerConfig(lambdaConflictHandlerConfig);
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
        if (getConflictHandler() != null)
            sb.append("ConflictHandler: ").append(getConflictHandler()).append(",");
        if (getConflictDetection() != null)
            sb.append("ConflictDetection: ").append(getConflictDetection()).append(",");
        if (getLambdaConflictHandlerConfig() != null)
            sb.append("LambdaConflictHandlerConfig: ").append(getLambdaConflictHandlerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncConfig == false)
            return false;
        SyncConfig other = (SyncConfig) obj;
        if (other.getConflictHandler() == null ^ this.getConflictHandler() == null)
            return false;
        if (other.getConflictHandler() != null && other.getConflictHandler().equals(this.getConflictHandler()) == false)
            return false;
        if (other.getConflictDetection() == null ^ this.getConflictDetection() == null)
            return false;
        if (other.getConflictDetection() != null && other.getConflictDetection().equals(this.getConflictDetection()) == false)
            return false;
        if (other.getLambdaConflictHandlerConfig() == null ^ this.getLambdaConflictHandlerConfig() == null)
            return false;
        if (other.getLambdaConflictHandlerConfig() != null && other.getLambdaConflictHandlerConfig().equals(this.getLambdaConflictHandlerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConflictHandler() == null) ? 0 : getConflictHandler().hashCode());
        hashCode = prime * hashCode + ((getConflictDetection() == null) ? 0 : getConflictDetection().hashCode());
        hashCode = prime * hashCode + ((getLambdaConflictHandlerConfig() == null) ? 0 : getLambdaConflictHandlerConfig().hashCode());
        return hashCode;
    }

    @Override
    public SyncConfig clone() {
        try {
            return (SyncConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.SyncConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
