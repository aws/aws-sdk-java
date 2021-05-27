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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the result of the analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AnalysisResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the analysis result. Analyses fall into the following types based on the validators used to generate
     * the analysis result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other AWS
     * services in a supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as limits).
     * Update your detector model or request a quota increase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expression-syntax</code> - Your expression must follow the required syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>data-type</code> - Data types referenced in the detector model must be compatible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-data</code> - You must define the data referenced in your detector model before you can use the
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-resource</code> - Resources that the detector model uses must be available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running detector
     * model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The severity level of the analysis result. Based on the severity level, analysis results fall into three general
     * categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code> - An information result tells you about a significant field in your detector model. This type
     * of result usually doesn't require immediate action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     * detector model. We recommend that you review warnings and take necessary actions before you use your detector
     * model in production environments. Otherwise, the detector model might not work as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must fix all
     * errors before you can publish your detector model.
     * </p>
     * </li>
     * </ul>
     */
    private String level;
    /**
     * <p>
     * Contains additional information about the analysis result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Contains one or more locations that you can use to locate the fields in your detector model that the analysis
     * result references.
     * </p>
     */
    private java.util.List<AnalysisResultLocation> locations;

    /**
     * <p>
     * The type of the analysis result. Analyses fall into the following types based on the validators used to generate
     * the analysis result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other AWS
     * services in a supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as limits).
     * Update your detector model or request a quota increase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expression-syntax</code> - Your expression must follow the required syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>data-type</code> - Data types referenced in the detector model must be compatible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-data</code> - You must define the data referenced in your detector model before you can use the
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-resource</code> - Resources that the detector model uses must be available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running detector
     * model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the analysis result. Analyses fall into the following types based on the validators used to
     *        generate the analysis result:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other
     *        AWS services in a supported AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as
     *        limits). Update your detector model or request a quota increase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expression-syntax</code> - Your expression must follow the required syntax.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>data-type</code> - Data types referenced in the detector model must be compatible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>referenced-data</code> - You must define the data referenced in your detector model before you can
     *        use the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>referenced-resource</code> - Resources that the detector model uses must be available.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running
     *        detector model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the analysis result. Analyses fall into the following types based on the validators used to generate
     * the analysis result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other AWS
     * services in a supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as limits).
     * Update your detector model or request a quota increase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expression-syntax</code> - Your expression must follow the required syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>data-type</code> - Data types referenced in the detector model must be compatible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-data</code> - You must define the data referenced in your detector model before you can use the
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-resource</code> - Resources that the detector model uses must be available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running detector
     * model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @return The type of the analysis result. Analyses fall into the following types based on the validators used to
     *         generate the analysis result:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other
     *         AWS services in a supported AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as
     *         limits). Update your detector model or request a quota increase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expression-syntax</code> - Your expression must follow the required syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>data-type</code> - Data types referenced in the detector model must be compatible.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>referenced-data</code> - You must define the data referenced in your detector model before you can
     *         use the data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>referenced-resource</code> - Resources that the detector model uses must be available.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running
     *         detector model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the analysis result. Analyses fall into the following types based on the validators used to generate
     * the analysis result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other AWS
     * services in a supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as limits).
     * Update your detector model or request a quota increase.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expression-syntax</code> - Your expression must follow the required syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>data-type</code> - Data types referenced in the detector model must be compatible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-data</code> - You must define the data referenced in your detector model before you can use the
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>referenced-resource</code> - Resources that the detector model uses must be available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running detector
     * model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the analysis result. Analyses fall into the following types based on the validators used to
     *        generate the analysis result:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>supported-actions</code> - You must specify AWS IoT Events supported actions that work with other
     *        AWS services in a supported AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-limits</code> - Resources or API operations can't exceed service quotas (also known as
     *        limits). Update your detector model or request a quota increase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>structure</code> - The detector model must follow a structure that AWS IoT Events supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expression-syntax</code> - Your expression must follow the required syntax.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>data-type</code> - Data types referenced in the detector model must be compatible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>referenced-data</code> - You must define the data referenced in your detector model before you can
     *        use the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>referenced-resource</code> - Resources that the detector model uses must be available.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Running
     *        detector model analyses</a> in the <i>AWS IoT Events Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The severity level of the analysis result. Based on the severity level, analysis results fall into three general
     * categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code> - An information result tells you about a significant field in your detector model. This type
     * of result usually doesn't require immediate action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     * detector model. We recommend that you review warnings and take necessary actions before you use your detector
     * model in production environments. Otherwise, the detector model might not work as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must fix all
     * errors before you can publish your detector model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param level
     *        The severity level of the analysis result. Based on the severity level, analysis results fall into three
     *        general categories:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code> - An information result tells you about a significant field in your detector model. This
     *        type of result usually doesn't require immediate action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     *        detector model. We recommend that you review warnings and take necessary actions before you use your
     *        detector model in production environments. Otherwise, the detector model might not work as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must
     *        fix all errors before you can publish your detector model.
     *        </p>
     *        </li>
     * @see AnalysisResultLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The severity level of the analysis result. Based on the severity level, analysis results fall into three general
     * categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code> - An information result tells you about a significant field in your detector model. This type
     * of result usually doesn't require immediate action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     * detector model. We recommend that you review warnings and take necessary actions before you use your detector
     * model in production environments. Otherwise, the detector model might not work as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must fix all
     * errors before you can publish your detector model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The severity level of the analysis result. Based on the severity level, analysis results fall into three
     *         general categories:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INFO</code> - An information result tells you about a significant field in your detector model.
     *         This type of result usually doesn't require immediate action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for
     *         your detector model. We recommend that you review warnings and take necessary actions before you use your
     *         detector model in production environments. Otherwise, the detector model might not work as expected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must
     *         fix all errors before you can publish your detector model.
     *         </p>
     *         </li>
     * @see AnalysisResultLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The severity level of the analysis result. Based on the severity level, analysis results fall into three general
     * categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code> - An information result tells you about a significant field in your detector model. This type
     * of result usually doesn't require immediate action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     * detector model. We recommend that you review warnings and take necessary actions before you use your detector
     * model in production environments. Otherwise, the detector model might not work as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must fix all
     * errors before you can publish your detector model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param level
     *        The severity level of the analysis result. Based on the severity level, analysis results fall into three
     *        general categories:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code> - An information result tells you about a significant field in your detector model. This
     *        type of result usually doesn't require immediate action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     *        detector model. We recommend that you review warnings and take necessary actions before you use your
     *        detector model in production environments. Otherwise, the detector model might not work as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must
     *        fix all errors before you can publish your detector model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisResultLevel
     */

    public AnalysisResult withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The severity level of the analysis result. Based on the severity level, analysis results fall into three general
     * categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code> - An information result tells you about a significant field in your detector model. This type
     * of result usually doesn't require immediate action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     * detector model. We recommend that you review warnings and take necessary actions before you use your detector
     * model in production environments. Otherwise, the detector model might not work as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must fix all
     * errors before you can publish your detector model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param level
     *        The severity level of the analysis result. Based on the severity level, analysis results fall into three
     *        general categories:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code> - An information result tells you about a significant field in your detector model. This
     *        type of result usually doesn't require immediate action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> - A warning result draws special attention to fields that might cause issues for your
     *        detector model. We recommend that you review warnings and take necessary actions before you use your
     *        detector model in production environments. Otherwise, the detector model might not work as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - An error result notifies you about a problem found in your detector model. You must
     *        fix all errors before you can publish your detector model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisResultLevel
     */

    public AnalysisResult withLevel(AnalysisResultLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * Contains additional information about the analysis result.
     * </p>
     * 
     * @param message
     *        Contains additional information about the analysis result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Contains additional information about the analysis result.
     * </p>
     * 
     * @return Contains additional information about the analysis result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Contains additional information about the analysis result.
     * </p>
     * 
     * @param message
     *        Contains additional information about the analysis result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Contains one or more locations that you can use to locate the fields in your detector model that the analysis
     * result references.
     * </p>
     * 
     * @return Contains one or more locations that you can use to locate the fields in your detector model that the
     *         analysis result references.
     */

    public java.util.List<AnalysisResultLocation> getLocations() {
        return locations;
    }

    /**
     * <p>
     * Contains one or more locations that you can use to locate the fields in your detector model that the analysis
     * result references.
     * </p>
     * 
     * @param locations
     *        Contains one or more locations that you can use to locate the fields in your detector model that the
     *        analysis result references.
     */

    public void setLocations(java.util.Collection<AnalysisResultLocation> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new java.util.ArrayList<AnalysisResultLocation>(locations);
    }

    /**
     * <p>
     * Contains one or more locations that you can use to locate the fields in your detector model that the analysis
     * result references.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        Contains one or more locations that you can use to locate the fields in your detector model that the
     *        analysis result references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withLocations(AnalysisResultLocation... locations) {
        if (this.locations == null) {
            setLocations(new java.util.ArrayList<AnalysisResultLocation>(locations.length));
        }
        for (AnalysisResultLocation ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more locations that you can use to locate the fields in your detector model that the analysis
     * result references.
     * </p>
     * 
     * @param locations
     *        Contains one or more locations that you can use to locate the fields in your detector model that the
     *        analysis result references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withLocations(java.util.Collection<AnalysisResultLocation> locations) {
        setLocations(locations);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getLocations() != null)
            sb.append("Locations: ").append(getLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisResult == false)
            return false;
        AnalysisResult other = (AnalysisResult) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisResult clone() {
        try {
            return (AnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AnalysisResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
