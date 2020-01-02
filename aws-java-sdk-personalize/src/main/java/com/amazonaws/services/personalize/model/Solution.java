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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that provides information about a solution. A solution is a trained model that can be deployed as a
 * campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Solution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Solution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the solution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the solution.
     * </p>
     */
    private String solutionArn;
    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     */
    private Boolean performHPO;
    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified
     * in the solution configuration (<code>recipeArn</code> must not be specified). When false (the default), Amazon
     * Personalize uses <code>recipeArn</code> for training.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     */
    private SolutionConfig solutionConfig;
    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     */
    private AutoMLResult autoMLResult;
    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * Describes the latest version of the solution, including the status and the ARN.
     * </p>
     */
    private SolutionVersionSummary latestSolutionVersion;

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @param name
     *        The name of the solution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @return The name of the solution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * 
     * @param name
     *        The name of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @return The ARN of the solution.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *        <code>false</code>.
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *         <code>false</code>.
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *         <code>false</code>.
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified
     * in the solution configuration (<code>recipeArn</code> must not be specified). When false (the default), Amazon
     * Personalize uses <code>recipeArn</code> for training.
     * </p>
     * 
     * @param performAutoML
     *        When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list
     *        specified in the solution configuration (<code>recipeArn</code> must not be specified). When false (the
     *        default), Amazon Personalize uses <code>recipeArn</code> for training.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified
     * in the solution configuration (<code>recipeArn</code> must not be specified). When false (the default), Amazon
     * Personalize uses <code>recipeArn</code> for training.
     * </p>
     * 
     * @return When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list
     *         specified in the solution configuration (<code>recipeArn</code> must not be specified). When false (the
     *         default), Amazon Personalize uses <code>recipeArn</code> for training.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified
     * in the solution configuration (<code>recipeArn</code> must not be specified). When false (the default), Amazon
     * Personalize uses <code>recipeArn</code> for training.
     * </p>
     * 
     * @param performAutoML
     *        When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list
     *        specified in the solution configuration (<code>recipeArn</code> must not be specified). When false (the
     *        default), Amazon Personalize uses <code>recipeArn</code> for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified
     * in the solution configuration (<code>recipeArn</code> must not be specified). When false (the default), Amazon
     * Personalize uses <code>recipeArn</code> for training.
     * </p>
     * 
     * @return When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list
     *         specified in the solution configuration (<code>recipeArn</code> must not be specified). When false (the
     *         default), Amazon Personalize uses <code>recipeArn</code> for training.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the recipe used to create the solution.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * 
     * @return The ARN of the recipe used to create the solution.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the recipe used to create the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @param eventType
     *        The event type (for example, 'click' or 'like') that is used for training the model.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @return The event type (for example, 'click' or 'like') that is used for training the model.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @param eventType
     *        The event type (for example, 'click' or 'like') that is used for training the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @param solutionConfig
     *        Describes the configuration properties for the solution.
     */

    public void setSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @return Describes the configuration properties for the solution.
     */

    public SolutionConfig getSolutionConfig() {
        return this.solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @param solutionConfig
     *        Describes the configuration properties for the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withSolutionConfig(SolutionConfig solutionConfig) {
        setSolutionConfig(solutionConfig);
        return this;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     * 
     * @param autoMLResult
     *        When <code>performAutoML</code> is true, specifies the best recipe found.
     */

    public void setAutoMLResult(AutoMLResult autoMLResult) {
        this.autoMLResult = autoMLResult;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     * 
     * @return When <code>performAutoML</code> is true, specifies the best recipe found.
     */

    public AutoMLResult getAutoMLResult() {
        return this.autoMLResult;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     * 
     * @param autoMLResult
     *        When <code>performAutoML</code> is true, specifies the best recipe found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withAutoMLResult(AutoMLResult autoMLResult) {
        setAutoMLResult(autoMLResult);
        return this;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution.</p>
     *        <p>
     *        A solution can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the solution.</p>
     *         <p>
     *         A solution can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution.</p>
     *        <p>
     *        A solution can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the solution.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the solution.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the solution was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and the ARN.
     * </p>
     * 
     * @param latestSolutionVersion
     *        Describes the latest version of the solution, including the status and the ARN.
     */

    public void setLatestSolutionVersion(SolutionVersionSummary latestSolutionVersion) {
        this.latestSolutionVersion = latestSolutionVersion;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and the ARN.
     * </p>
     * 
     * @return Describes the latest version of the solution, including the status and the ARN.
     */

    public SolutionVersionSummary getLatestSolutionVersion() {
        return this.latestSolutionVersion;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and the ARN.
     * </p>
     * 
     * @param latestSolutionVersion
     *        Describes the latest version of the solution, including the status and the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Solution withLatestSolutionVersion(SolutionVersionSummary latestSolutionVersion) {
        setLatestSolutionVersion(latestSolutionVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
        if (getPerformHPO() != null)
            sb.append("PerformHPO: ").append(getPerformHPO()).append(",");
        if (getPerformAutoML() != null)
            sb.append("PerformAutoML: ").append(getPerformAutoML()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getSolutionConfig() != null)
            sb.append("SolutionConfig: ").append(getSolutionConfig()).append(",");
        if (getAutoMLResult() != null)
            sb.append("AutoMLResult: ").append(getAutoMLResult()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getLatestSolutionVersion() != null)
            sb.append("LatestSolutionVersion: ").append(getLatestSolutionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Solution == false)
            return false;
        Solution other = (Solution) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getSolutionConfig() == null ^ this.getSolutionConfig() == null)
            return false;
        if (other.getSolutionConfig() != null && other.getSolutionConfig().equals(this.getSolutionConfig()) == false)
            return false;
        if (other.getAutoMLResult() == null ^ this.getAutoMLResult() == null)
            return false;
        if (other.getAutoMLResult() != null && other.getAutoMLResult().equals(this.getAutoMLResult()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getLatestSolutionVersion() == null ^ this.getLatestSolutionVersion() == null)
            return false;
        if (other.getLatestSolutionVersion() != null && other.getLatestSolutionVersion().equals(this.getLatestSolutionVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoMLResult() == null) ? 0 : getAutoMLResult().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLatestSolutionVersion() == null) ? 0 : getLatestSolutionVersion().hashCode());
        return hashCode;
    }

    @Override
    public Solution clone() {
        try {
            return (Solution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.SolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
