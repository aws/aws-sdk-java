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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter that returns a more specific list of recommendations. Filters recommendations by different
 * dimensions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     */
    private java.util.List<String> actionTypes;
    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     */
    private java.util.List<String> implementationEfforts;
    /**
     * <p>
     * The IDs for the recommendations.
     * </p>
     */
    private java.util.List<String> recommendationIds;
    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The resource ID of the recommendation.
     * </p>
     */
    private java.util.List<String> resourceIds;
    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     */
    private Boolean restartNeeded;
    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     */
    private Boolean rollbackPossible;
    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @return The account that the recommendation is for.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @param accountIds
     *        The account that the recommendation is for.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The account that the recommendation is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account that the recommendation is for.
     * </p>
     * 
     * @param accountIds
     *        The account that the recommendation is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     * 
     * @return The type of action you can take by adopting the recommendation.
     * @see ActionType
     */

    public java.util.List<String> getActionTypes() {
        return actionTypes;
    }

    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     * 
     * @param actionTypes
     *        The type of action you can take by adopting the recommendation.
     * @see ActionType
     */

    public void setActionTypes(java.util.Collection<String> actionTypes) {
        if (actionTypes == null) {
            this.actionTypes = null;
            return;
        }

        this.actionTypes = new java.util.ArrayList<String>(actionTypes);
    }

    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionTypes(java.util.Collection)} or {@link #withActionTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionTypes
     *        The type of action you can take by adopting the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Filter withActionTypes(String... actionTypes) {
        if (this.actionTypes == null) {
            setActionTypes(new java.util.ArrayList<String>(actionTypes.length));
        }
        for (String ele : actionTypes) {
            this.actionTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     * 
     * @param actionTypes
     *        The type of action you can take by adopting the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Filter withActionTypes(java.util.Collection<String> actionTypes) {
        setActionTypes(actionTypes);
        return this;
    }

    /**
     * <p>
     * The type of action you can take by adopting the recommendation.
     * </p>
     * 
     * @param actionTypes
     *        The type of action you can take by adopting the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Filter withActionTypes(ActionType... actionTypes) {
        java.util.ArrayList<String> actionTypesCopy = new java.util.ArrayList<String>(actionTypes.length);
        for (ActionType value : actionTypes) {
            actionTypesCopy.add(value.toString());
        }
        if (getActionTypes() == null) {
            setActionTypes(actionTypesCopy);
        } else {
            getActionTypes().addAll(actionTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @return The effort required to implement the recommendation.
     * @see ImplementationEffort
     */

    public java.util.List<String> getImplementationEfforts() {
        return implementationEfforts;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @param implementationEfforts
     *        The effort required to implement the recommendation.
     * @see ImplementationEffort
     */

    public void setImplementationEfforts(java.util.Collection<String> implementationEfforts) {
        if (implementationEfforts == null) {
            this.implementationEfforts = null;
            return;
        }

        this.implementationEfforts = new java.util.ArrayList<String>(implementationEfforts);
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImplementationEfforts(java.util.Collection)} or
     * {@link #withImplementationEfforts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param implementationEfforts
     *        The effort required to implement the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImplementationEffort
     */

    public Filter withImplementationEfforts(String... implementationEfforts) {
        if (this.implementationEfforts == null) {
            setImplementationEfforts(new java.util.ArrayList<String>(implementationEfforts.length));
        }
        for (String ele : implementationEfforts) {
            this.implementationEfforts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @param implementationEfforts
     *        The effort required to implement the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImplementationEffort
     */

    public Filter withImplementationEfforts(java.util.Collection<String> implementationEfforts) {
        setImplementationEfforts(implementationEfforts);
        return this;
    }

    /**
     * <p>
     * The effort required to implement the recommendation.
     * </p>
     * 
     * @param implementationEfforts
     *        The effort required to implement the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImplementationEffort
     */

    public Filter withImplementationEfforts(ImplementationEffort... implementationEfforts) {
        java.util.ArrayList<String> implementationEffortsCopy = new java.util.ArrayList<String>(implementationEfforts.length);
        for (ImplementationEffort value : implementationEfforts) {
            implementationEffortsCopy.add(value.toString());
        }
        if (getImplementationEfforts() == null) {
            setImplementationEfforts(implementationEffortsCopy);
        } else {
            getImplementationEfforts().addAll(implementationEffortsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for the recommendations.
     * </p>
     * 
     * @return The IDs for the recommendations.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * The IDs for the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for the recommendations.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * The IDs for the recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The IDs for the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @return The Amazon Web Services Region of the resource.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Region of the resource.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Region of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Region of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommendation.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Name (ARN) of the recommendation.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Name (ARN) of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Name (ARN) of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The resource ID of the recommendation.
     * </p>
     * 
     * @return The resource ID of the recommendation.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The resource ID of the recommendation.
     * </p>
     * 
     * @param resourceIds
     *        The resource ID of the recommendation.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The resource ID of the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource ID of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource ID of the recommendation.
     * </p>
     * 
     * @param resourceIds
     *        The resource ID of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     * 
     * @return The resource type of the recommendation.
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type of the recommendation.
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Filter withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Filter withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource type of the recommendation.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Filter withResourceTypes(ResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @param restartNeeded
     *        Whether or not implementing the recommendation requires a restart.
     */

    public void setRestartNeeded(Boolean restartNeeded) {
        this.restartNeeded = restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @return Whether or not implementing the recommendation requires a restart.
     */

    public Boolean getRestartNeeded() {
        return this.restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @param restartNeeded
     *        Whether or not implementing the recommendation requires a restart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRestartNeeded(Boolean restartNeeded) {
        setRestartNeeded(restartNeeded);
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation requires a restart.
     * </p>
     * 
     * @return Whether or not implementing the recommendation requires a restart.
     */

    public Boolean isRestartNeeded() {
        return this.restartNeeded;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @param rollbackPossible
     *        Whether or not implementing the recommendation can be rolled back.
     */

    public void setRollbackPossible(Boolean rollbackPossible) {
        this.rollbackPossible = rollbackPossible;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @return Whether or not implementing the recommendation can be rolled back.
     */

    public Boolean getRollbackPossible() {
        return this.rollbackPossible;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @param rollbackPossible
     *        Whether or not implementing the recommendation can be rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRollbackPossible(Boolean rollbackPossible) {
        setRollbackPossible(rollbackPossible);
        return this;
    }

    /**
     * <p>
     * Whether or not implementing the recommendation can be rolled back.
     * </p>
     * 
     * @return Whether or not implementing the recommendation can be rolled back.
     */

    public Boolean isRollbackPossible() {
        return this.rollbackPossible;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @return A list of tags assigned to the recommendation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to the recommendation.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getActionTypes() != null)
            sb.append("ActionTypes: ").append(getActionTypes()).append(",");
        if (getImplementationEfforts() != null)
            sb.append("ImplementationEfforts: ").append(getImplementationEfforts()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getRestartNeeded() != null)
            sb.append("RestartNeeded: ").append(getRestartNeeded()).append(",");
        if (getRollbackPossible() != null)
            sb.append("RollbackPossible: ").append(getRollbackPossible()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getActionTypes() == null ^ this.getActionTypes() == null)
            return false;
        if (other.getActionTypes() != null && other.getActionTypes().equals(this.getActionTypes()) == false)
            return false;
        if (other.getImplementationEfforts() == null ^ this.getImplementationEfforts() == null)
            return false;
        if (other.getImplementationEfforts() != null && other.getImplementationEfforts().equals(this.getImplementationEfforts()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getRestartNeeded() == null ^ this.getRestartNeeded() == null)
            return false;
        if (other.getRestartNeeded() != null && other.getRestartNeeded().equals(this.getRestartNeeded()) == false)
            return false;
        if (other.getRollbackPossible() == null ^ this.getRollbackPossible() == null)
            return false;
        if (other.getRollbackPossible() != null && other.getRollbackPossible().equals(this.getRollbackPossible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getActionTypes() == null) ? 0 : getActionTypes().hashCode());
        hashCode = prime * hashCode + ((getImplementationEfforts() == null) ? 0 : getImplementationEfforts().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRestartNeeded() == null) ? 0 : getRestartNeeded().hashCode());
        hashCode = prime * hashCode + ((getRollbackPossible() == null) ? 0 : getRollbackPossible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
