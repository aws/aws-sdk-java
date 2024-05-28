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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateEvaluationForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEvaluationFormRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;
    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     */
    private EvaluationFormScoringStrategy scoringStrategy;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @return A title of the evaluation form.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @return The description of the evaluation form.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @return Items that are part of the evaluation form. The total number of sections and questions must not exceed
     *         100 each. Questions must be contained in a section.
     */

    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     */

    public void setItems(java.util.Collection<EvaluationFormItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EvaluationFormItem>(items);
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withItems(EvaluationFormItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<EvaluationFormItem>(items.length));
        }
        for (EvaluationFormItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     */

    public void setScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @return A scoring strategy of the evaluation form.
     */

    public EvaluationFormScoringStrategy getScoringStrategy() {
        return this.scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        setScoringStrategy(scoringStrategy);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationFormRequest withClientToken(String clientToken) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getScoringStrategy() != null)
            sb.append("ScoringStrategy: ").append(getScoringStrategy()).append(",");
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

        if (obj instanceof CreateEvaluationFormRequest == false)
            return false;
        CreateEvaluationFormRequest other = (CreateEvaluationFormRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getScoringStrategy() == null ^ this.getScoringStrategy() == null)
            return false;
        if (other.getScoringStrategy() != null && other.getScoringStrategy().equals(this.getScoringStrategy()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getScoringStrategy() == null) ? 0 : getScoringStrategy().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateEvaluationFormRequest clone() {
        return (CreateEvaluationFormRequest) super.clone();
    }

}
