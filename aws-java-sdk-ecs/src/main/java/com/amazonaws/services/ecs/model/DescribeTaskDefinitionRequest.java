/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     * <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     * Resource Name (ARN) of the task definition to describe.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> include;

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     * <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     * Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     *        <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     *        Resource Name (ARN) of the task definition to describe.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     * <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     * Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @return The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     *         <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full
     *         Amazon Resource Name (ARN) of the task definition to describe.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     * <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     * Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> for the latest <code>ACTIVE</code> revision, <code>family</code> and
     *        <code>revision</code> (<code>family:revision</code>) for a specific revision in the family, or full Amazon
     *        Resource Name (ARN) of the task definition to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskDefinitionRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @return Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified,
     *         the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see TaskDefinitionField
     */

    public java.util.List<String> getInclude() {
        if (include == null) {
            include = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return include;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see TaskDefinitionField
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new com.amazonaws.internal.SdkInternalList<String>(include);
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionField
     */

    public DescribeTaskDefinitionRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new com.amazonaws.internal.SdkInternalList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionField
     */

    public DescribeTaskDefinitionRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether to see the resource tags for the task definition. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionField
     */

    public DescribeTaskDefinitionRequest withInclude(TaskDefinitionField... include) {
        com.amazonaws.internal.SdkInternalList<String> includeCopy = new com.amazonaws.internal.SdkInternalList<String>(include.length);
        for (TaskDefinitionField value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
        }
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
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskDefinitionRequest == false)
            return false;
        DescribeTaskDefinitionRequest other = (DescribeTaskDefinitionRequest) obj;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskDefinitionRequest clone() {
        return (DescribeTaskDefinitionRequest) super.clone();
    }

}
