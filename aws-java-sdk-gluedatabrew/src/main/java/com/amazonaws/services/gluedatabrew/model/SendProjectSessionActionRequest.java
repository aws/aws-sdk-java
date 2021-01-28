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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendProjectSessionActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If true, the result of the recipe step will be returned, but not applied.
     * </p>
     */
    private Boolean preview;
    /**
     * <p>
     * The name of the project to apply the action to.
     * </p>
     */
    private String name;

    private RecipeStep recipeStep;
    /**
     * <p>
     * The index from which to preview a step. This index is used to preview the result of steps that have already been
     * applied, so that the resulting view frame is from earlier in the view frame stack.
     * </p>
     */
    private Integer stepIndex;
    /**
     * <p>
     * A unique identifier for an interactive session that's currently open and ready for work. The action will be
     * performed on this session.
     * </p>
     */
    private String clientSessionId;

    private ViewFrame viewFrame;

    /**
     * <p>
     * If true, the result of the recipe step will be returned, but not applied.
     * </p>
     * 
     * @param preview
     *        If true, the result of the recipe step will be returned, but not applied.
     */

    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    /**
     * <p>
     * If true, the result of the recipe step will be returned, but not applied.
     * </p>
     * 
     * @return If true, the result of the recipe step will be returned, but not applied.
     */

    public Boolean getPreview() {
        return this.preview;
    }

    /**
     * <p>
     * If true, the result of the recipe step will be returned, but not applied.
     * </p>
     * 
     * @param preview
     *        If true, the result of the recipe step will be returned, but not applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withPreview(Boolean preview) {
        setPreview(preview);
        return this;
    }

    /**
     * <p>
     * If true, the result of the recipe step will be returned, but not applied.
     * </p>
     * 
     * @return If true, the result of the recipe step will be returned, but not applied.
     */

    public Boolean isPreview() {
        return this.preview;
    }

    /**
     * <p>
     * The name of the project to apply the action to.
     * </p>
     * 
     * @param name
     *        The name of the project to apply the action to.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project to apply the action to.
     * </p>
     * 
     * @return The name of the project to apply the action to.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project to apply the action to.
     * </p>
     * 
     * @param name
     *        The name of the project to apply the action to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param recipeStep
     */

    public void setRecipeStep(RecipeStep recipeStep) {
        this.recipeStep = recipeStep;
    }

    /**
     * @return
     */

    public RecipeStep getRecipeStep() {
        return this.recipeStep;
    }

    /**
     * @param recipeStep
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withRecipeStep(RecipeStep recipeStep) {
        setRecipeStep(recipeStep);
        return this;
    }

    /**
     * <p>
     * The index from which to preview a step. This index is used to preview the result of steps that have already been
     * applied, so that the resulting view frame is from earlier in the view frame stack.
     * </p>
     * 
     * @param stepIndex
     *        The index from which to preview a step. This index is used to preview the result of steps that have
     *        already been applied, so that the resulting view frame is from earlier in the view frame stack.
     */

    public void setStepIndex(Integer stepIndex) {
        this.stepIndex = stepIndex;
    }

    /**
     * <p>
     * The index from which to preview a step. This index is used to preview the result of steps that have already been
     * applied, so that the resulting view frame is from earlier in the view frame stack.
     * </p>
     * 
     * @return The index from which to preview a step. This index is used to preview the result of steps that have
     *         already been applied, so that the resulting view frame is from earlier in the view frame stack.
     */

    public Integer getStepIndex() {
        return this.stepIndex;
    }

    /**
     * <p>
     * The index from which to preview a step. This index is used to preview the result of steps that have already been
     * applied, so that the resulting view frame is from earlier in the view frame stack.
     * </p>
     * 
     * @param stepIndex
     *        The index from which to preview a step. This index is used to preview the result of steps that have
     *        already been applied, so that the resulting view frame is from earlier in the view frame stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withStepIndex(Integer stepIndex) {
        setStepIndex(stepIndex);
        return this;
    }

    /**
     * <p>
     * A unique identifier for an interactive session that's currently open and ready for work. The action will be
     * performed on this session.
     * </p>
     * 
     * @param clientSessionId
     *        A unique identifier for an interactive session that's currently open and ready for work. The action will
     *        be performed on this session.
     */

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    /**
     * <p>
     * A unique identifier for an interactive session that's currently open and ready for work. The action will be
     * performed on this session.
     * </p>
     * 
     * @return A unique identifier for an interactive session that's currently open and ready for work. The action will
     *         be performed on this session.
     */

    public String getClientSessionId() {
        return this.clientSessionId;
    }

    /**
     * <p>
     * A unique identifier for an interactive session that's currently open and ready for work. The action will be
     * performed on this session.
     * </p>
     * 
     * @param clientSessionId
     *        A unique identifier for an interactive session that's currently open and ready for work. The action will
     *        be performed on this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withClientSessionId(String clientSessionId) {
        setClientSessionId(clientSessionId);
        return this;
    }

    /**
     * @param viewFrame
     */

    public void setViewFrame(ViewFrame viewFrame) {
        this.viewFrame = viewFrame;
    }

    /**
     * @return
     */

    public ViewFrame getViewFrame() {
        return this.viewFrame;
    }

    /**
     * @param viewFrame
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionRequest withViewFrame(ViewFrame viewFrame) {
        setViewFrame(viewFrame);
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
        if (getPreview() != null)
            sb.append("Preview: ").append(getPreview()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecipeStep() != null)
            sb.append("RecipeStep: ").append(getRecipeStep()).append(",");
        if (getStepIndex() != null)
            sb.append("StepIndex: ").append(getStepIndex()).append(",");
        if (getClientSessionId() != null)
            sb.append("ClientSessionId: ").append(getClientSessionId()).append(",");
        if (getViewFrame() != null)
            sb.append("ViewFrame: ").append(getViewFrame());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendProjectSessionActionRequest == false)
            return false;
        SendProjectSessionActionRequest other = (SendProjectSessionActionRequest) obj;
        if (other.getPreview() == null ^ this.getPreview() == null)
            return false;
        if (other.getPreview() != null && other.getPreview().equals(this.getPreview()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeStep() == null ^ this.getRecipeStep() == null)
            return false;
        if (other.getRecipeStep() != null && other.getRecipeStep().equals(this.getRecipeStep()) == false)
            return false;
        if (other.getStepIndex() == null ^ this.getStepIndex() == null)
            return false;
        if (other.getStepIndex() != null && other.getStepIndex().equals(this.getStepIndex()) == false)
            return false;
        if (other.getClientSessionId() == null ^ this.getClientSessionId() == null)
            return false;
        if (other.getClientSessionId() != null && other.getClientSessionId().equals(this.getClientSessionId()) == false)
            return false;
        if (other.getViewFrame() == null ^ this.getViewFrame() == null)
            return false;
        if (other.getViewFrame() != null && other.getViewFrame().equals(this.getViewFrame()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreview() == null) ? 0 : getPreview().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeStep() == null) ? 0 : getRecipeStep().hashCode());
        hashCode = prime * hashCode + ((getStepIndex() == null) ? 0 : getStepIndex().hashCode());
        hashCode = prime * hashCode + ((getClientSessionId() == null) ? 0 : getClientSessionId().hashCode());
        hashCode = prime * hashCode + ((getViewFrame() == null) ? 0 : getViewFrame().hashCode());
        return hashCode;
    }

    @Override
    public SendProjectSessionActionRequest clone() {
        return (SendProjectSessionActionRequest) super.clone();
    }

}
