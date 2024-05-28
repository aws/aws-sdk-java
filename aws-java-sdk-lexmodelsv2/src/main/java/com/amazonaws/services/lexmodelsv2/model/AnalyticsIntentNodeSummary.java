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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information about the requested path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsIntentNodeSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsIntentNodeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent at the end of the requested path.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The path.
     * </p>
     */
    private String intentPath;
    /**
     * <p>
     * The total number of sessions that follow the given path to the given intent.
     * </p>
     */
    private Integer intentCount;
    /**
     * <p>
     * The number of intents up to and including the requested path.
     * </p>
     */
    private Integer intentLevel;
    /**
     * <p>
     * Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The name of the intent at the end of the requested path.
     * </p>
     * 
     * @param intentName
     *        The name of the intent at the end of the requested path.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent at the end of the requested path.
     * </p>
     * 
     * @return The name of the intent at the end of the requested path.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent at the end of the requested path.
     * </p>
     * 
     * @param intentName
     *        The name of the intent at the end of the requested path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentNodeSummary withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The path.
     * </p>
     * 
     * @param intentPath
     *        The path.
     */

    public void setIntentPath(String intentPath) {
        this.intentPath = intentPath;
    }

    /**
     * <p>
     * The path.
     * </p>
     * 
     * @return The path.
     */

    public String getIntentPath() {
        return this.intentPath;
    }

    /**
     * <p>
     * The path.
     * </p>
     * 
     * @param intentPath
     *        The path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentNodeSummary withIntentPath(String intentPath) {
        setIntentPath(intentPath);
        return this;
    }

    /**
     * <p>
     * The total number of sessions that follow the given path to the given intent.
     * </p>
     * 
     * @param intentCount
     *        The total number of sessions that follow the given path to the given intent.
     */

    public void setIntentCount(Integer intentCount) {
        this.intentCount = intentCount;
    }

    /**
     * <p>
     * The total number of sessions that follow the given path to the given intent.
     * </p>
     * 
     * @return The total number of sessions that follow the given path to the given intent.
     */

    public Integer getIntentCount() {
        return this.intentCount;
    }

    /**
     * <p>
     * The total number of sessions that follow the given path to the given intent.
     * </p>
     * 
     * @param intentCount
     *        The total number of sessions that follow the given path to the given intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentNodeSummary withIntentCount(Integer intentCount) {
        setIntentCount(intentCount);
        return this;
    }

    /**
     * <p>
     * The number of intents up to and including the requested path.
     * </p>
     * 
     * @param intentLevel
     *        The number of intents up to and including the requested path.
     */

    public void setIntentLevel(Integer intentLevel) {
        this.intentLevel = intentLevel;
    }

    /**
     * <p>
     * The number of intents up to and including the requested path.
     * </p>
     * 
     * @return The number of intents up to and including the requested path.
     */

    public Integer getIntentLevel() {
        return this.intentLevel;
    }

    /**
     * <p>
     * The number of intents up to and including the requested path.
     * </p>
     * 
     * @param intentLevel
     *        The number of intents up to and including the requested path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentNodeSummary withIntentLevel(Integer intentLevel) {
        setIntentLevel(intentLevel);
        return this;
    }

    /**
     * <p>
     * Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * </p>
     * 
     * @param nodeType
     *        Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * @see AnalyticsNodeType
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * </p>
     * 
     * @return Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * @see AnalyticsNodeType
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * </p>
     * 
     * @param nodeType
     *        Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsNodeType
     */

    public AnalyticsIntentNodeSummary withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * </p>
     * 
     * @param nodeType
     *        Specifies whether the node is the end of a path (<code>Exit</code>) or not (<code>Inner</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsNodeType
     */

    public AnalyticsIntentNodeSummary withNodeType(AnalyticsNodeType nodeType) {
        this.nodeType = nodeType.toString();
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getIntentPath() != null)
            sb.append("IntentPath: ").append(getIntentPath()).append(",");
        if (getIntentCount() != null)
            sb.append("IntentCount: ").append(getIntentCount()).append(",");
        if (getIntentLevel() != null)
            sb.append("IntentLevel: ").append(getIntentLevel()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsIntentNodeSummary == false)
            return false;
        AnalyticsIntentNodeSummary other = (AnalyticsIntentNodeSummary) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getIntentPath() == null ^ this.getIntentPath() == null)
            return false;
        if (other.getIntentPath() != null && other.getIntentPath().equals(this.getIntentPath()) == false)
            return false;
        if (other.getIntentCount() == null ^ this.getIntentCount() == null)
            return false;
        if (other.getIntentCount() != null && other.getIntentCount().equals(this.getIntentCount()) == false)
            return false;
        if (other.getIntentLevel() == null ^ this.getIntentLevel() == null)
            return false;
        if (other.getIntentLevel() != null && other.getIntentLevel().equals(this.getIntentLevel()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getIntentPath() == null) ? 0 : getIntentPath().hashCode());
        hashCode = prime * hashCode + ((getIntentCount() == null) ? 0 : getIntentCount().hashCode());
        hashCode = prime * hashCode + ((getIntentLevel() == null) ? 0 : getIntentLevel().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsIntentNodeSummary clone() {
        try {
            return (AnalyticsIntentNodeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsIntentNodeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
