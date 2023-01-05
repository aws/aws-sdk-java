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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a recommendation template created with the <a>CreateRecommendationTemplate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RecommendationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The end time for the action.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The format of the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     */
    private String format;
    /**
     * <p>
     * The message for the recommendation template.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates if replacements are needed.
     * </p>
     */
    private Boolean needsReplacements;
    /**
     * <p>
     * Identifiers for the recommendations used in the recommendation template.
     * </p>
     */
    private java.util.List<String> recommendationIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation template.
     * </p>
     */
    private String recommendationTemplateArn;
    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<String> recommendationTypes;
    /**
     * <p>
     * The start time for the action.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The file location of the template.
     * </p>
     */
    private S3Location templatesLocation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @return The end time for the action.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The format of the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format of the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @see TemplateFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The format of the recommendation template.</p>
     *         <dl>
     *         <dt>CfnJson</dt>
     *         <dd>
     *         <p>
     *         The template is CloudFormation JSON.
     *         </p>
     *         </dd>
     *         <dt>CfnYaml</dt>
     *         <dd>
     *         <p>
     *         The template is CloudFormation YAML.
     *         </p>
     *         </dd>
     * @see TemplateFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format of the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public RecommendationTemplate withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format of the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public RecommendationTemplate withFormat(TemplateFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The message for the recommendation template.
     * </p>
     * 
     * @param message
     *        The message for the recommendation template.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message for the recommendation template.
     * </p>
     * 
     * @return The message for the recommendation template.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message for the recommendation template.
     * </p>
     * 
     * @param message
     *        The message for the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @param name
     *        The name for the recommendation template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @return The name for the recommendation template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @param name
     *        The name for the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates if replacements are needed.
     * </p>
     * 
     * @param needsReplacements
     *        Indicates if replacements are needed.
     */

    public void setNeedsReplacements(Boolean needsReplacements) {
        this.needsReplacements = needsReplacements;
    }

    /**
     * <p>
     * Indicates if replacements are needed.
     * </p>
     * 
     * @return Indicates if replacements are needed.
     */

    public Boolean getNeedsReplacements() {
        return this.needsReplacements;
    }

    /**
     * <p>
     * Indicates if replacements are needed.
     * </p>
     * 
     * @param needsReplacements
     *        Indicates if replacements are needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withNeedsReplacements(Boolean needsReplacements) {
        setNeedsReplacements(needsReplacements);
        return this;
    }

    /**
     * <p>
     * Indicates if replacements are needed.
     * </p>
     * 
     * @return Indicates if replacements are needed.
     */

    public Boolean isNeedsReplacements() {
        return this.needsReplacements;
    }

    /**
     * <p>
     * Identifiers for the recommendations used in the recommendation template.
     * </p>
     * 
     * @return Identifiers for the recommendations used in the recommendation template.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * Identifiers for the recommendations used in the recommendation template.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used in the recommendation template.
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
     * Identifiers for the recommendations used in the recommendation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used in the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withRecommendationIds(String... recommendationIds) {
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
     * Identifiers for the recommendations used in the recommendation template.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used in the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for the recommendation template.
     */

    public void setRecommendationTemplateArn(String recommendationTemplateArn) {
        this.recommendationTemplateArn = recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the recommendation template.
     */

    public String getRecommendationTemplateArn() {
        return this.recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withRecommendationTemplateArn(String recommendationTemplateArn) {
        setRecommendationTemplateArn(recommendationTemplateArn);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return An array of strings that specify the recommendation template type or types.</p>
     *         <dl>
     *         <dt>Alarm</dt>
     *         <dd>
     *         <p>
     *         The template is an <a>AlarmRecommendation</a> template.
     *         </p>
     *         </dd>
     *         <dt>Sop</dt>
     *         <dd>
     *         <p>
     *         The template is a <a>SopRecommendation</a> template.
     *         </p>
     *         </dd>
     *         <dt>Test</dt>
     *         <dd>
     *         <p>
     *         The template is a <a>TestRecommendation</a> template.
     *         </p>
     *         </dd>
     * @see RenderRecommendationType
     */

    public java.util.List<String> getRecommendationTypes() {
        return recommendationTypes;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @see RenderRecommendationType
     */

    public void setRecommendationTypes(java.util.Collection<String> recommendationTypes) {
        if (recommendationTypes == null) {
            this.recommendationTypes = null;
            return;
        }

        this.recommendationTypes = new java.util.ArrayList<String>(recommendationTypes);
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationTypes(java.util.Collection)} or {@link #withRecommendationTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public RecommendationTemplate withRecommendationTypes(String... recommendationTypes) {
        if (this.recommendationTypes == null) {
            setRecommendationTypes(new java.util.ArrayList<String>(recommendationTypes.length));
        }
        for (String ele : recommendationTypes) {
            this.recommendationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public RecommendationTemplate withRecommendationTypes(java.util.Collection<String> recommendationTypes) {
        setRecommendationTypes(recommendationTypes);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public RecommendationTemplate withRecommendationTypes(RenderRecommendationType... recommendationTypes) {
        java.util.ArrayList<String> recommendationTypesCopy = new java.util.ArrayList<String>(recommendationTypes.length);
        for (RenderRecommendationType value : recommendationTypes) {
            recommendationTypesCopy.add(value.toString());
        }
        if (getRecommendationTypes() == null) {
            setRecommendationTypes(recommendationTypesCopy);
        } else {
            getRecommendationTypes().addAll(recommendationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The start time for the action.
     * </p>
     * 
     * @param startTime
     *        The start time for the action.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time for the action.
     * </p>
     * 
     * @return The start time for the action.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time for the action.
     * </p>
     * 
     * @param startTime
     *        The start time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see RecommendationTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see RecommendationTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTemplateStatus
     */

    public RecommendationTemplate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTemplateStatus
     */

    public RecommendationTemplate withStatus(RecommendationTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RecommendationTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The file location of the template.
     * </p>
     * 
     * @param templatesLocation
     *        The file location of the template.
     */

    public void setTemplatesLocation(S3Location templatesLocation) {
        this.templatesLocation = templatesLocation;
    }

    /**
     * <p>
     * The file location of the template.
     * </p>
     * 
     * @return The file location of the template.
     */

    public S3Location getTemplatesLocation() {
        return this.templatesLocation;
    }

    /**
     * <p>
     * The file location of the template.
     * </p>
     * 
     * @param templatesLocation
     *        The file location of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationTemplate withTemplatesLocation(S3Location templatesLocation) {
        setTemplatesLocation(templatesLocation);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNeedsReplacements() != null)
            sb.append("NeedsReplacements: ").append(getNeedsReplacements()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds()).append(",");
        if (getRecommendationTemplateArn() != null)
            sb.append("RecommendationTemplateArn: ").append(getRecommendationTemplateArn()).append(",");
        if (getRecommendationTypes() != null)
            sb.append("RecommendationTypes: ").append(getRecommendationTypes()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplatesLocation() != null)
            sb.append("TemplatesLocation: ").append(getTemplatesLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationTemplate == false)
            return false;
        RecommendationTemplate other = (RecommendationTemplate) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNeedsReplacements() == null ^ this.getNeedsReplacements() == null)
            return false;
        if (other.getNeedsReplacements() != null && other.getNeedsReplacements().equals(this.getNeedsReplacements()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        if (other.getRecommendationTemplateArn() == null ^ this.getRecommendationTemplateArn() == null)
            return false;
        if (other.getRecommendationTemplateArn() != null && other.getRecommendationTemplateArn().equals(this.getRecommendationTemplateArn()) == false)
            return false;
        if (other.getRecommendationTypes() == null ^ this.getRecommendationTypes() == null)
            return false;
        if (other.getRecommendationTypes() != null && other.getRecommendationTypes().equals(this.getRecommendationTypes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplatesLocation() == null ^ this.getTemplatesLocation() == null)
            return false;
        if (other.getTemplatesLocation() != null && other.getTemplatesLocation().equals(this.getTemplatesLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNeedsReplacements() == null) ? 0 : getNeedsReplacements().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTemplateArn() == null) ? 0 : getRecommendationTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTypes() == null) ? 0 : getRecommendationTypes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplatesLocation() == null) ? 0 : getTemplatesLocation().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationTemplate clone() {
        try {
            return (RecommendationTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.RecommendationTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
