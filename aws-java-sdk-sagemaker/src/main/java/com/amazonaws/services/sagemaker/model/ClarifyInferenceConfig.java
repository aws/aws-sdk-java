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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The inference configuration parameter for the model container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyInferenceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyInferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the JMESPath expression to extract the features from a model container input in JSON Lines format. For
     * example, if <code>FeaturesAttribute</code> is the JMESPath expression <code>'myfeatures'</code>, it extracts a
     * list of features <code>[1,2,3]</code> from request data <code>'{"myfeatures":[1,2,3]}'</code>.
     * </p>
     */
    private String featuresAttribute;
    /**
     * <p>
     * A template string used to format a JSON record into an acceptable model container input. For example, a
     * <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     * <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the model
     * container input is in JSON Lines format.
     * </p>
     */
    private String contentTemplate;
    /**
     * <p>
     * The maximum number of records in a request that the model container can process when querying the model container
     * for the predictions of a <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     * >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a single
     * line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one record per
     * request. A value of 2 or greater means that the model expects batch requests, which can reduce overhead and speed
     * up the inferencing process. If this parameter is not provided, the explainer will tune the record count per
     * request according to the model container's capacity at runtime.
     * </p>
     */
    private Integer maxRecordCount;
    /**
     * <p>
     * The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     * <code>6</code> MB.
     * </p>
     */
    private Integer maxPayloadInMB;
    /**
     * <p>
     * A zero-based index used to extract a probability value (score) or list from model container output in CSV format.
     * If this value is not provided, the entire model container output will be treated as a probability value (score)
     * or list.
     * </p>
     * <p>
     * <b>Example for a single class model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to <code>1</code> to
     * select the probability value <code>0.6</code>.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set
     * <code>ProbabilityIndex</code> to <code>1</code> to select the probability values <code>[0.1,0.6,0.3]</code>.
     * </p>
     */
    private Integer probabilityIndex;
    /**
     * <p>
     * A zero-based index used to extract a label header or list of label headers from model container output in CSV
     * format.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     * probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     * <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     * </p>
     */
    private Integer labelIndex;
    /**
     * <p>
     * A JMESPath expression used to extract the probability (or score) from the model container output if the model
     * container is in JSON Lines format.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a single request is
     * <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     * <code>'probability'</code>.
     * </p>
     */
    private String probabilityAttribute;
    /**
     * <p>
     * A JMESPath expression used to locate the list of label headers in the model container output.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a batch request is
     * <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set <code>LabelAttribute</code>
     * to <code>'labels'</code> to extract the list of label headers <code>["cat","dog","fish"]</code>
     * </p>
     */
    private String labelAttribute;
    /**
     * <p>
     * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label
     * header is the name of the predicted label. These are used to help readability for the output of the
     * <code>InvokeEndpoint</code> API. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If there are
     * no label headers in the model container output, provide them manually using this parameter.
     * </p>
     */
    private java.util.List<String> labelHeaders;
    /**
     * <p>
     * The names of the features. If provided, these are included in the endpoint response payload to help readability
     * of the <code>InvokeEndpoint</code> output. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     */
    private java.util.List<String> featureHeaders;
    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * Provides the JMESPath expression to extract the features from a model container input in JSON Lines format. For
     * example, if <code>FeaturesAttribute</code> is the JMESPath expression <code>'myfeatures'</code>, it extracts a
     * list of features <code>[1,2,3]</code> from request data <code>'{"myfeatures":[1,2,3]}'</code>.
     * </p>
     * 
     * @param featuresAttribute
     *        Provides the JMESPath expression to extract the features from a model container input in JSON Lines
     *        format. For example, if <code>FeaturesAttribute</code> is the JMESPath expression
     *        <code>'myfeatures'</code>, it extracts a list of features <code>[1,2,3]</code> from request data
     *        <code>'{"myfeatures":[1,2,3]}'</code>.
     */

    public void setFeaturesAttribute(String featuresAttribute) {
        this.featuresAttribute = featuresAttribute;
    }

    /**
     * <p>
     * Provides the JMESPath expression to extract the features from a model container input in JSON Lines format. For
     * example, if <code>FeaturesAttribute</code> is the JMESPath expression <code>'myfeatures'</code>, it extracts a
     * list of features <code>[1,2,3]</code> from request data <code>'{"myfeatures":[1,2,3]}'</code>.
     * </p>
     * 
     * @return Provides the JMESPath expression to extract the features from a model container input in JSON Lines
     *         format. For example, if <code>FeaturesAttribute</code> is the JMESPath expression
     *         <code>'myfeatures'</code>, it extracts a list of features <code>[1,2,3]</code> from request data
     *         <code>'{"myfeatures":[1,2,3]}'</code>.
     */

    public String getFeaturesAttribute() {
        return this.featuresAttribute;
    }

    /**
     * <p>
     * Provides the JMESPath expression to extract the features from a model container input in JSON Lines format. For
     * example, if <code>FeaturesAttribute</code> is the JMESPath expression <code>'myfeatures'</code>, it extracts a
     * list of features <code>[1,2,3]</code> from request data <code>'{"myfeatures":[1,2,3]}'</code>.
     * </p>
     * 
     * @param featuresAttribute
     *        Provides the JMESPath expression to extract the features from a model container input in JSON Lines
     *        format. For example, if <code>FeaturesAttribute</code> is the JMESPath expression
     *        <code>'myfeatures'</code>, it extracts a list of features <code>[1,2,3]</code> from request data
     *        <code>'{"myfeatures":[1,2,3]}'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withFeaturesAttribute(String featuresAttribute) {
        setFeaturesAttribute(featuresAttribute);
        return this;
    }

    /**
     * <p>
     * A template string used to format a JSON record into an acceptable model container input. For example, a
     * <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     * <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the model
     * container input is in JSON Lines format.
     * </p>
     * 
     * @param contentTemplate
     *        A template string used to format a JSON record into an acceptable model container input. For example, a
     *        <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     *        <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the
     *        model container input is in JSON Lines format.
     */

    public void setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    /**
     * <p>
     * A template string used to format a JSON record into an acceptable model container input. For example, a
     * <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     * <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the model
     * container input is in JSON Lines format.
     * </p>
     * 
     * @return A template string used to format a JSON record into an acceptable model container input. For example, a
     *         <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of
     *         features <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only
     *         when the model container input is in JSON Lines format.
     */

    public String getContentTemplate() {
        return this.contentTemplate;
    }

    /**
     * <p>
     * A template string used to format a JSON record into an acceptable model container input. For example, a
     * <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     * <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the model
     * container input is in JSON Lines format.
     * </p>
     * 
     * @param contentTemplate
     *        A template string used to format a JSON record into an acceptable model container input. For example, a
     *        <code>ContentTemplate</code> string <code>'{"myfeatures":$features}'</code> will format a list of features
     *        <code>[1,2,3]</code> into the record string <code>'{"myfeatures":[1,2,3]}'</code>. Required only when the
     *        model container input is in JSON Lines format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withContentTemplate(String contentTemplate) {
        setContentTemplate(contentTemplate);
        return this;
    }

    /**
     * <p>
     * The maximum number of records in a request that the model container can process when querying the model container
     * for the predictions of a <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     * >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a single
     * line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one record per
     * request. A value of 2 or greater means that the model expects batch requests, which can reduce overhead and speed
     * up the inferencing process. If this parameter is not provided, the explainer will tune the record count per
     * request according to the model container's capacity at runtime.
     * </p>
     * 
     * @param maxRecordCount
     *        The maximum number of records in a request that the model container can process when querying the model
     *        container for the predictions of a <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     *        >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a
     *        single line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one
     *        record per request. A value of 2 or greater means that the model expects batch requests, which can reduce
     *        overhead and speed up the inferencing process. If this parameter is not provided, the explainer will tune
     *        the record count per request according to the model container's capacity at runtime.
     */

    public void setMaxRecordCount(Integer maxRecordCount) {
        this.maxRecordCount = maxRecordCount;
    }

    /**
     * <p>
     * The maximum number of records in a request that the model container can process when querying the model container
     * for the predictions of a <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     * >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a single
     * line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one record per
     * request. A value of 2 or greater means that the model expects batch requests, which can reduce overhead and speed
     * up the inferencing process. If this parameter is not provided, the explainer will tune the record count per
     * request according to the model container's capacity at runtime.
     * </p>
     * 
     * @return The maximum number of records in a request that the model container can process when querying the model
     *         container for the predictions of a <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     *         >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a
     *         single line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects
     *         one record per request. A value of 2 or greater means that the model expects batch requests, which can
     *         reduce overhead and speed up the inferencing process. If this parameter is not provided, the explainer
     *         will tune the record count per request according to the model container's capacity at runtime.
     */

    public Integer getMaxRecordCount() {
        return this.maxRecordCount;
    }

    /**
     * <p>
     * The maximum number of records in a request that the model container can process when querying the model container
     * for the predictions of a <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     * >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a single
     * line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one record per
     * request. A value of 2 or greater means that the model expects batch requests, which can reduce overhead and speed
     * up the inferencing process. If this parameter is not provided, the explainer will tune the record count per
     * request according to the model container's capacity at runtime.
     * </p>
     * 
     * @param maxRecordCount
     *        The maximum number of records in a request that the model container can process when querying the model
     *        container for the predictions of a <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic"
     *        >synthetic dataset</a>. A record is a unit of input data that inference can be made on, for example, a
     *        single line in CSV data. If <code>MaxRecordCount</code> is <code>1</code>, the model container expects one
     *        record per request. A value of 2 or greater means that the model expects batch requests, which can reduce
     *        overhead and speed up the inferencing process. If this parameter is not provided, the explainer will tune
     *        the record count per request according to the model container's capacity at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withMaxRecordCount(Integer maxRecordCount) {
        setMaxRecordCount(maxRecordCount);
        return this;
    }

    /**
     * <p>
     * The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     * <code>6</code> MB.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     *        <code>6</code> MB.
     */

    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     * <code>6</code> MB.
     * </p>
     * 
     * @return The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     *         <code>6</code> MB.
     */

    public Integer getMaxPayloadInMB() {
        return this.maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     * <code>6</code> MB.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to
     *        <code>6</code> MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withMaxPayloadInMB(Integer maxPayloadInMB) {
        setMaxPayloadInMB(maxPayloadInMB);
        return this;
    }

    /**
     * <p>
     * A zero-based index used to extract a probability value (score) or list from model container output in CSV format.
     * If this value is not provided, the entire model container output will be treated as a probability value (score)
     * or list.
     * </p>
     * <p>
     * <b>Example for a single class model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to <code>1</code> to
     * select the probability value <code>0.6</code>.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set
     * <code>ProbabilityIndex</code> to <code>1</code> to select the probability values <code>[0.1,0.6,0.3]</code>.
     * </p>
     * 
     * @param probabilityIndex
     *        A zero-based index used to extract a probability value (score) or list from model container output in CSV
     *        format. If this value is not provided, the entire model container output will be treated as a probability
     *        value (score) or list.</p>
     *        <p>
     *        <b>Example for a single class model:</b> If the model container output consists of a string-formatted
     *        prediction label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to
     *        <code>1</code> to select the probability value <code>0.6</code>.
     *        </p>
     *        <p>
     *        <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted
     *        prediction label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>,
     *        set <code>ProbabilityIndex</code> to <code>1</code> to select the probability values
     *        <code>[0.1,0.6,0.3]</code>.
     */

    public void setProbabilityIndex(Integer probabilityIndex) {
        this.probabilityIndex = probabilityIndex;
    }

    /**
     * <p>
     * A zero-based index used to extract a probability value (score) or list from model container output in CSV format.
     * If this value is not provided, the entire model container output will be treated as a probability value (score)
     * or list.
     * </p>
     * <p>
     * <b>Example for a single class model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to <code>1</code> to
     * select the probability value <code>0.6</code>.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set
     * <code>ProbabilityIndex</code> to <code>1</code> to select the probability values <code>[0.1,0.6,0.3]</code>.
     * </p>
     * 
     * @return A zero-based index used to extract a probability value (score) or list from model container output in CSV
     *         format. If this value is not provided, the entire model container output will be treated as a probability
     *         value (score) or list.</p>
     *         <p>
     *         <b>Example for a single class model:</b> If the model container output consists of a string-formatted
     *         prediction label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to
     *         <code>1</code> to select the probability value <code>0.6</code>.
     *         </p>
     *         <p>
     *         <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted
     *         prediction label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>
     *         , set <code>ProbabilityIndex</code> to <code>1</code> to select the probability values
     *         <code>[0.1,0.6,0.3]</code>.
     */

    public Integer getProbabilityIndex() {
        return this.probabilityIndex;
    }

    /**
     * <p>
     * A zero-based index used to extract a probability value (score) or list from model container output in CSV format.
     * If this value is not provided, the entire model container output will be treated as a probability value (score)
     * or list.
     * </p>
     * <p>
     * <b>Example for a single class model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to <code>1</code> to
     * select the probability value <code>0.6</code>.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted prediction
     * label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set
     * <code>ProbabilityIndex</code> to <code>1</code> to select the probability values <code>[0.1,0.6,0.3]</code>.
     * </p>
     * 
     * @param probabilityIndex
     *        A zero-based index used to extract a probability value (score) or list from model container output in CSV
     *        format. If this value is not provided, the entire model container output will be treated as a probability
     *        value (score) or list.</p>
     *        <p>
     *        <b>Example for a single class model:</b> If the model container output consists of a string-formatted
     *        prediction label followed by its probability: <code>'1,0.6'</code>, set <code>ProbabilityIndex</code> to
     *        <code>1</code> to select the probability value <code>0.6</code>.
     *        </p>
     *        <p>
     *        <b>Example for a multiclass model:</b> If the model container output consists of a string-formatted
     *        prediction label followed by its probability: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>,
     *        set <code>ProbabilityIndex</code> to <code>1</code> to select the probability values
     *        <code>[0.1,0.6,0.3]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withProbabilityIndex(Integer probabilityIndex) {
        setProbabilityIndex(probabilityIndex);
        return this;
    }

    /**
     * <p>
     * A zero-based index used to extract a label header or list of label headers from model container output in CSV
     * format.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     * probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     * <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     * </p>
     * 
     * @param labelIndex
     *        A zero-based index used to extract a label header or list of label headers from model container output in
     *        CSV format.</p>
     *        <p>
     *        <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     *        probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     *        <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     */

    public void setLabelIndex(Integer labelIndex) {
        this.labelIndex = labelIndex;
    }

    /**
     * <p>
     * A zero-based index used to extract a label header or list of label headers from model container output in CSV
     * format.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     * probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     * <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     * </p>
     * 
     * @return A zero-based index used to extract a label header or list of label headers from model container output in
     *         CSV format.</p>
     *         <p>
     *         <b>Example for a multiclass model:</b> If the model container output consists of label headers followed
     *         by probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set
     *         <code>LabelIndex</code> to <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     */

    public Integer getLabelIndex() {
        return this.labelIndex;
    }

    /**
     * <p>
     * A zero-based index used to extract a label header or list of label headers from model container output in CSV
     * format.
     * </p>
     * <p>
     * <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     * probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     * <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     * </p>
     * 
     * @param labelIndex
     *        A zero-based index used to extract a label header or list of label headers from model container output in
     *        CSV format.</p>
     *        <p>
     *        <b>Example for a multiclass model:</b> If the model container output consists of label headers followed by
     *        probabilities: <code>'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'</code>, set <code>LabelIndex</code> to
     *        <code>0</code> to select the label headers <code>['cat','dog','fish']</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withLabelIndex(Integer labelIndex) {
        setLabelIndex(labelIndex);
        return this;
    }

    /**
     * <p>
     * A JMESPath expression used to extract the probability (or score) from the model container output if the model
     * container is in JSON Lines format.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a single request is
     * <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     * <code>'probability'</code>.
     * </p>
     * 
     * @param probabilityAttribute
     *        A JMESPath expression used to extract the probability (or score) from the model container output if the
     *        model container is in JSON Lines format.</p>
     *        <p>
     *        <b>Example</b>: If the model container output of a single request is
     *        <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     *        <code>'probability'</code>.
     */

    public void setProbabilityAttribute(String probabilityAttribute) {
        this.probabilityAttribute = probabilityAttribute;
    }

    /**
     * <p>
     * A JMESPath expression used to extract the probability (or score) from the model container output if the model
     * container is in JSON Lines format.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a single request is
     * <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     * <code>'probability'</code>.
     * </p>
     * 
     * @return A JMESPath expression used to extract the probability (or score) from the model container output if the
     *         model container is in JSON Lines format.</p>
     *         <p>
     *         <b>Example</b>: If the model container output of a single request is
     *         <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     *         <code>'probability'</code>.
     */

    public String getProbabilityAttribute() {
        return this.probabilityAttribute;
    }

    /**
     * <p>
     * A JMESPath expression used to extract the probability (or score) from the model container output if the model
     * container is in JSON Lines format.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a single request is
     * <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     * <code>'probability'</code>.
     * </p>
     * 
     * @param probabilityAttribute
     *        A JMESPath expression used to extract the probability (or score) from the model container output if the
     *        model container is in JSON Lines format.</p>
     *        <p>
     *        <b>Example</b>: If the model container output of a single request is
     *        <code>'{"predicted_label":1,"probability":0.6}'</code>, then set <code>ProbabilityAttribute</code> to
     *        <code>'probability'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withProbabilityAttribute(String probabilityAttribute) {
        setProbabilityAttribute(probabilityAttribute);
        return this;
    }

    /**
     * <p>
     * A JMESPath expression used to locate the list of label headers in the model container output.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a batch request is
     * <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set <code>LabelAttribute</code>
     * to <code>'labels'</code> to extract the list of label headers <code>["cat","dog","fish"]</code>
     * </p>
     * 
     * @param labelAttribute
     *        A JMESPath expression used to locate the list of label headers in the model container output.</p>
     *        <p>
     *        <b>Example</b>: If the model container output of a batch request is
     *        <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set
     *        <code>LabelAttribute</code> to <code>'labels'</code> to extract the list of label headers
     *        <code>["cat","dog","fish"]</code>
     */

    public void setLabelAttribute(String labelAttribute) {
        this.labelAttribute = labelAttribute;
    }

    /**
     * <p>
     * A JMESPath expression used to locate the list of label headers in the model container output.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a batch request is
     * <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set <code>LabelAttribute</code>
     * to <code>'labels'</code> to extract the list of label headers <code>["cat","dog","fish"]</code>
     * </p>
     * 
     * @return A JMESPath expression used to locate the list of label headers in the model container output.</p>
     *         <p>
     *         <b>Example</b>: If the model container output of a batch request is
     *         <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set
     *         <code>LabelAttribute</code> to <code>'labels'</code> to extract the list of label headers
     *         <code>["cat","dog","fish"]</code>
     */

    public String getLabelAttribute() {
        return this.labelAttribute;
    }

    /**
     * <p>
     * A JMESPath expression used to locate the list of label headers in the model container output.
     * </p>
     * <p>
     * <b>Example</b>: If the model container output of a batch request is
     * <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set <code>LabelAttribute</code>
     * to <code>'labels'</code> to extract the list of label headers <code>["cat","dog","fish"]</code>
     * </p>
     * 
     * @param labelAttribute
     *        A JMESPath expression used to locate the list of label headers in the model container output.</p>
     *        <p>
     *        <b>Example</b>: If the model container output of a batch request is
     *        <code>'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'</code>, then set
     *        <code>LabelAttribute</code> to <code>'labels'</code> to extract the list of label headers
     *        <code>["cat","dog","fish"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withLabelAttribute(String labelAttribute) {
        setLabelAttribute(labelAttribute);
        return this;
    }

    /**
     * <p>
     * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label
     * header is the name of the predicted label. These are used to help readability for the output of the
     * <code>InvokeEndpoint</code> API. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If there are
     * no label headers in the model container output, provide them manually using this parameter.
     * </p>
     * 
     * @return For multiclass classification problems, the label headers are the names of the classes. Otherwise, the
     *         label header is the name of the predicted label. These are used to help readability for the output of the
     *         <code>InvokeEndpoint</code> API. See the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *         >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If
     *         there are no label headers in the model container output, provide them manually using this parameter.
     */

    public java.util.List<String> getLabelHeaders() {
        return labelHeaders;
    }

    /**
     * <p>
     * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label
     * header is the name of the predicted label. These are used to help readability for the output of the
     * <code>InvokeEndpoint</code> API. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If there are
     * no label headers in the model container output, provide them manually using this parameter.
     * </p>
     * 
     * @param labelHeaders
     *        For multiclass classification problems, the label headers are the names of the classes. Otherwise, the
     *        label header is the name of the predicted label. These are used to help readability for the output of the
     *        <code>InvokeEndpoint</code> API. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If
     *        there are no label headers in the model container output, provide them manually using this parameter.
     */

    public void setLabelHeaders(java.util.Collection<String> labelHeaders) {
        if (labelHeaders == null) {
            this.labelHeaders = null;
            return;
        }

        this.labelHeaders = new java.util.ArrayList<String>(labelHeaders);
    }

    /**
     * <p>
     * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label
     * header is the name of the predicted label. These are used to help readability for the output of the
     * <code>InvokeEndpoint</code> API. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If there are
     * no label headers in the model container output, provide them manually using this parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelHeaders(java.util.Collection)} or {@link #withLabelHeaders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param labelHeaders
     *        For multiclass classification problems, the label headers are the names of the classes. Otherwise, the
     *        label header is the name of the predicted label. These are used to help readability for the output of the
     *        <code>InvokeEndpoint</code> API. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If
     *        there are no label headers in the model container output, provide them manually using this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withLabelHeaders(String... labelHeaders) {
        if (this.labelHeaders == null) {
            setLabelHeaders(new java.util.ArrayList<String>(labelHeaders.length));
        }
        for (String ele : labelHeaders) {
            this.labelHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label
     * header is the name of the predicted label. These are used to help readability for the output of the
     * <code>InvokeEndpoint</code> API. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If there are
     * no label headers in the model container output, provide them manually using this parameter.
     * </p>
     * 
     * @param labelHeaders
     *        For multiclass classification problems, the label headers are the names of the classes. Otherwise, the
     *        label header is the name of the predicted label. These are used to help readability for the output of the
     *        <code>InvokeEndpoint</code> API. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information. If
     *        there are no label headers in the model container output, provide them manually using this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withLabelHeaders(java.util.Collection<String> labelHeaders) {
        setLabelHeaders(labelHeaders);
        return this;
    }

    /**
     * <p>
     * The names of the features. If provided, these are included in the endpoint response payload to help readability
     * of the <code>InvokeEndpoint</code> output. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @return The names of the features. If provided, these are included in the endpoint response payload to help
     *         readability of the <code>InvokeEndpoint</code> output. See the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *         >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     */

    public java.util.List<String> getFeatureHeaders() {
        return featureHeaders;
    }

    /**
     * <p>
     * The names of the features. If provided, these are included in the endpoint response payload to help readability
     * of the <code>InvokeEndpoint</code> output. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @param featureHeaders
     *        The names of the features. If provided, these are included in the endpoint response payload to help
     *        readability of the <code>InvokeEndpoint</code> output. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     */

    public void setFeatureHeaders(java.util.Collection<String> featureHeaders) {
        if (featureHeaders == null) {
            this.featureHeaders = null;
            return;
        }

        this.featureHeaders = new java.util.ArrayList<String>(featureHeaders);
    }

    /**
     * <p>
     * The names of the features. If provided, these are included in the endpoint response payload to help readability
     * of the <code>InvokeEndpoint</code> output. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureHeaders(java.util.Collection)} or {@link #withFeatureHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param featureHeaders
     *        The names of the features. If provided, these are included in the endpoint response payload to help
     *        readability of the <code>InvokeEndpoint</code> output. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withFeatureHeaders(String... featureHeaders) {
        if (this.featureHeaders == null) {
            setFeatureHeaders(new java.util.ArrayList<String>(featureHeaders.length));
        }
        for (String ele : featureHeaders) {
            this.featureHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the features. If provided, these are included in the endpoint response payload to help readability
     * of the <code>InvokeEndpoint</code> output. See the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @param featureHeaders
     *        The names of the features. If provided, these are included in the endpoint response payload to help
     *        readability of the <code>InvokeEndpoint</code> output. See the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >Response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyInferenceConfig withFeatureHeaders(java.util.Collection<String> featureHeaders) {
        setFeatureHeaders(featureHeaders);
        return this;
    }

    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @return A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     *         <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example,
     *         <code>['text']</code>). If <code>FeatureTypes</code> is not provided, the explainer infers the feature
     *         types based on the baseline data. The feature types are included in the endpoint response payload. For
     *         additional information see the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *         >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @see ClarifyFeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @param featureTypes
     *        A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     *        <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example,
     *        <code>['text']</code>). If <code>FeatureTypes</code> is not provided, the explainer infers the feature
     *        types based on the baseline data. The feature types are included in the endpoint response payload. For
     *        additional information see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @see ClarifyFeatureType
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     *        <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example,
     *        <code>['text']</code>). If <code>FeatureTypes</code> is not provided, the explainer infers the feature
     *        types based on the baseline data. The feature types are included in the endpoint response payload. For
     *        additional information see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyFeatureType
     */

    public ClarifyInferenceConfig withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @param featureTypes
     *        A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     *        <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example,
     *        <code>['text']</code>). If <code>FeatureTypes</code> is not provided, the explainer infers the feature
     *        types based on the baseline data. The feature types are included in the endpoint response payload. For
     *        additional information see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyFeatureType
     */

    public ClarifyInferenceConfig withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     * <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example, <code>['text']</code>).
     * If <code>FeatureTypes</code> is not provided, the explainer infers the feature types based on the baseline data.
     * The feature types are included in the endpoint response payload. For additional information see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     * >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * </p>
     * 
     * @param featureTypes
     *        A list of data types of the features (optional). Applicable only to NLP explainability. If provided,
     *        <code>FeatureTypes</code> must have at least one <code>'text'</code> string (for example,
     *        <code>['text']</code>). If <code>FeatureTypes</code> is not provided, the explainer infers the feature
     *        types based on the baseline data. The feature types are included in the endpoint response payload. For
     *        additional information see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response"
     *        >response</a> section under <b>Invoke the endpoint</b> in the Developer Guide for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyFeatureType
     */

    public ClarifyInferenceConfig withFeatureTypes(ClarifyFeatureType... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (ClarifyFeatureType value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
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
        if (getFeaturesAttribute() != null)
            sb.append("FeaturesAttribute: ").append(getFeaturesAttribute()).append(",");
        if (getContentTemplate() != null)
            sb.append("ContentTemplate: ").append(getContentTemplate()).append(",");
        if (getMaxRecordCount() != null)
            sb.append("MaxRecordCount: ").append(getMaxRecordCount()).append(",");
        if (getMaxPayloadInMB() != null)
            sb.append("MaxPayloadInMB: ").append(getMaxPayloadInMB()).append(",");
        if (getProbabilityIndex() != null)
            sb.append("ProbabilityIndex: ").append(getProbabilityIndex()).append(",");
        if (getLabelIndex() != null)
            sb.append("LabelIndex: ").append(getLabelIndex()).append(",");
        if (getProbabilityAttribute() != null)
            sb.append("ProbabilityAttribute: ").append(getProbabilityAttribute()).append(",");
        if (getLabelAttribute() != null)
            sb.append("LabelAttribute: ").append(getLabelAttribute()).append(",");
        if (getLabelHeaders() != null)
            sb.append("LabelHeaders: ").append(getLabelHeaders()).append(",");
        if (getFeatureHeaders() != null)
            sb.append("FeatureHeaders: ").append(getFeatureHeaders()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyInferenceConfig == false)
            return false;
        ClarifyInferenceConfig other = (ClarifyInferenceConfig) obj;
        if (other.getFeaturesAttribute() == null ^ this.getFeaturesAttribute() == null)
            return false;
        if (other.getFeaturesAttribute() != null && other.getFeaturesAttribute().equals(this.getFeaturesAttribute()) == false)
            return false;
        if (other.getContentTemplate() == null ^ this.getContentTemplate() == null)
            return false;
        if (other.getContentTemplate() != null && other.getContentTemplate().equals(this.getContentTemplate()) == false)
            return false;
        if (other.getMaxRecordCount() == null ^ this.getMaxRecordCount() == null)
            return false;
        if (other.getMaxRecordCount() != null && other.getMaxRecordCount().equals(this.getMaxRecordCount()) == false)
            return false;
        if (other.getMaxPayloadInMB() == null ^ this.getMaxPayloadInMB() == null)
            return false;
        if (other.getMaxPayloadInMB() != null && other.getMaxPayloadInMB().equals(this.getMaxPayloadInMB()) == false)
            return false;
        if (other.getProbabilityIndex() == null ^ this.getProbabilityIndex() == null)
            return false;
        if (other.getProbabilityIndex() != null && other.getProbabilityIndex().equals(this.getProbabilityIndex()) == false)
            return false;
        if (other.getLabelIndex() == null ^ this.getLabelIndex() == null)
            return false;
        if (other.getLabelIndex() != null && other.getLabelIndex().equals(this.getLabelIndex()) == false)
            return false;
        if (other.getProbabilityAttribute() == null ^ this.getProbabilityAttribute() == null)
            return false;
        if (other.getProbabilityAttribute() != null && other.getProbabilityAttribute().equals(this.getProbabilityAttribute()) == false)
            return false;
        if (other.getLabelAttribute() == null ^ this.getLabelAttribute() == null)
            return false;
        if (other.getLabelAttribute() != null && other.getLabelAttribute().equals(this.getLabelAttribute()) == false)
            return false;
        if (other.getLabelHeaders() == null ^ this.getLabelHeaders() == null)
            return false;
        if (other.getLabelHeaders() != null && other.getLabelHeaders().equals(this.getLabelHeaders()) == false)
            return false;
        if (other.getFeatureHeaders() == null ^ this.getFeatureHeaders() == null)
            return false;
        if (other.getFeatureHeaders() != null && other.getFeatureHeaders().equals(this.getFeatureHeaders()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturesAttribute() == null) ? 0 : getFeaturesAttribute().hashCode());
        hashCode = prime * hashCode + ((getContentTemplate() == null) ? 0 : getContentTemplate().hashCode());
        hashCode = prime * hashCode + ((getMaxRecordCount() == null) ? 0 : getMaxRecordCount().hashCode());
        hashCode = prime * hashCode + ((getMaxPayloadInMB() == null) ? 0 : getMaxPayloadInMB().hashCode());
        hashCode = prime * hashCode + ((getProbabilityIndex() == null) ? 0 : getProbabilityIndex().hashCode());
        hashCode = prime * hashCode + ((getLabelIndex() == null) ? 0 : getLabelIndex().hashCode());
        hashCode = prime * hashCode + ((getProbabilityAttribute() == null) ? 0 : getProbabilityAttribute().hashCode());
        hashCode = prime * hashCode + ((getLabelAttribute() == null) ? 0 : getLabelAttribute().hashCode());
        hashCode = prime * hashCode + ((getLabelHeaders() == null) ? 0 : getLabelHeaders().hashCode());
        hashCode = prime * hashCode + ((getFeatureHeaders() == null) ? 0 : getFeatureHeaders().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyInferenceConfig clone() {
        try {
            return (ClarifyInferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyInferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
