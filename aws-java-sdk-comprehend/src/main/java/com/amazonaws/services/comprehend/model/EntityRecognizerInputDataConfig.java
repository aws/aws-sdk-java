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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the format and location of the input data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerInputDataConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerInputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     * information about the custom entities that your trained model will detect. The required format of the file
     * depends on whether you are providing annotations or an entity list.
     * </p>
     * <p>
     * If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     * <code>EntityList</code> parameters. You must provide your training documents by using the <code>Documents</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels.
     * Each label annotates a named entity in the training document.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer.
     * Any entity types that you don't specify are ignored.
     * </p>
     * <p>
     * A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain
     * the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     */
    private java.util.List<EntityTypesListItem> entityTypes;
    /**
     * <p>
     * The S3 location of the folder that contains the training documents for your custom entity recognizer.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * </p>
     */
    private EntityRecognizerDocuments documents;
    /**
     * <p>
     * The S3 location of the CSV file that annotates your training documents.
     * </p>
     */
    private EntityRecognizerAnnotations annotations;
    /**
     * <p>
     * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     * </p>
     */
    private EntityRecognizerEntityList entityList;
    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     */
    private java.util.List<AugmentedManifestsListItem> augmentedManifests;

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     * information about the custom entities that your trained model will detect. The required format of the file
     * depends on whether you are providing annotations or an entity list.
     * </p>
     * <p>
     * If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     * <code>EntityList</code> parameters. You must provide your training documents by using the <code>Documents</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels.
     * Each label annotates a named entity in the training document.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     *        information about the custom entities that your trained model will detect. The required format of the file
     *        depends on whether you are providing annotations or an entity list.
     *        </p>
     *        <p>
     *        If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     *        <code>EntityList</code> parameters. You must provide your training documents by using the
     *        <code>Documents</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its labels. Each label annotates a named entity in the training document.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @see EntityRecognizerDataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     * information about the custom entities that your trained model will detect. The required format of the file
     * depends on whether you are providing annotations or an entity list.
     * </p>
     * <p>
     * If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     * <code>EntityList</code> parameters. You must provide your training documents by using the <code>Documents</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels.
     * Each label annotates a named entity in the training document.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @return The format of your training data:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     *         information about the custom entities that your trained model will detect. The required format of the
     *         file depends on whether you are providing annotations or an entity list.
     *         </p>
     *         <p>
     *         If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     *         <code>EntityList</code> parameters. You must provide your training documents by using the
     *         <code>Documents</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth.
     *         This file is in JSON lines format. Each line is a complete JSON object that contains a training document
     *         and its labels. Each label annotates a named entity in the training document.
     *         </p>
     *         <p>
     *         If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @see EntityRecognizerDataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     * information about the custom entities that your trained model will detect. The required format of the file
     * depends on whether you are providing annotations or an entity list.
     * </p>
     * <p>
     * If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     * <code>EntityList</code> parameters. You must provide your training documents by using the <code>Documents</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels.
     * Each label annotates a named entity in the training document.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     *        information about the custom entities that your trained model will detect. The required format of the file
     *        depends on whether you are providing annotations or an entity list.
     *        </p>
     *        <p>
     *        If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     *        <code>EntityList</code> parameters. You must provide your training documents by using the
     *        <code>Documents</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its labels. Each label annotates a named entity in the training document.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityRecognizerDataFormat
     */

    public EntityRecognizerInputDataConfig withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     * information about the custom entities that your trained model will detect. The required format of the file
     * depends on whether you are providing annotations or an entity list.
     * </p>
     * <p>
     * If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     * <code>EntityList</code> parameters. You must provide your training documents by using the <code>Documents</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels.
     * Each label annotates a named entity in the training document.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The CSV file contains
     *        information about the custom entities that your trained model will detect. The required format of the file
     *        depends on whether you are providing annotations or an entity list.
     *        </p>
     *        <p>
     *        If you use this value, you must provide your CSV file by using either the <code>Annotations</code> or
     *        <code>EntityList</code> parameters. You must provide your training documents by using the
     *        <code>Documents</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its labels. Each label annotates a named entity in the training document.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityRecognizerDataFormat
     */

    public EntityRecognizerInputDataConfig withDataFormat(EntityRecognizerDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer.
     * Any entity types that you don't specify are ignored.
     * </p>
     * <p>
     * A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain
     * the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * 
     * @return The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity
     *         recognizer. Any entity types that you don't specify are ignored.</p>
     *         <p>
     *         A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not
     *         contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage
     *         return), \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     */

    public java.util.List<EntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer.
     * Any entity types that you don't specify are ignored.
     * </p>
     * <p>
     * A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain
     * the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity
     *        recognizer. Any entity types that you don't specify are ignored.</p>
     *        <p>
     *        A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not
     *        contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return),
     *        \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     */

    public void setEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityTypesListItem>(entityTypes);
    }

    /**
     * <p>
     * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer.
     * Any entity types that you don't specify are ignored.
     * </p>
     * <p>
     * A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain
     * the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity
     *        recognizer. Any entity types that you don't specify are ignored.</p>
     *        <p>
     *        A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not
     *        contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return),
     *        \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityTypes(EntityTypesListItem... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<EntityTypesListItem>(entityTypes.length));
        }
        for (EntityTypesListItem ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer.
     * Any entity types that you don't specify are ignored.
     * </p>
     * <p>
     * A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain
     * the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity
     *        recognizer. Any entity types that you don't specify are ignored.</p>
     *        <p>
     *        A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not
     *        contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return),
     *        \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * The S3 location of the folder that contains the training documents for your custom entity recognizer.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * </p>
     * 
     * @param documents
     *        The S3 location of the folder that contains the training documents for your custom entity recognizer.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     */

    public void setDocuments(EntityRecognizerDocuments documents) {
        this.documents = documents;
    }

    /**
     * <p>
     * The S3 location of the folder that contains the training documents for your custom entity recognizer.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * </p>
     * 
     * @return The S3 location of the folder that contains the training documents for your custom entity recognizer.</p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     */

    public EntityRecognizerDocuments getDocuments() {
        return this.documents;
    }

    /**
     * <p>
     * The S3 location of the folder that contains the training documents for your custom entity recognizer.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * </p>
     * 
     * @param documents
     *        The S3 location of the folder that contains the training documents for your custom entity recognizer.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withDocuments(EntityRecognizerDocuments documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * The S3 location of the CSV file that annotates your training documents.
     * </p>
     * 
     * @param annotations
     *        The S3 location of the CSV file that annotates your training documents.
     */

    public void setAnnotations(EntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
    }

    /**
     * <p>
     * The S3 location of the CSV file that annotates your training documents.
     * </p>
     * 
     * @return The S3 location of the CSV file that annotates your training documents.
     */

    public EntityRecognizerAnnotations getAnnotations() {
        return this.annotations;
    }

    /**
     * <p>
     * The S3 location of the CSV file that annotates your training documents.
     * </p>
     * 
     * @param annotations
     *        The S3 location of the CSV file that annotates your training documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withAnnotations(EntityRecognizerAnnotations annotations) {
        setAnnotations(annotations);
        return this;
    }

    /**
     * <p>
     * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     * </p>
     * 
     * @param entityList
     *        The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     */

    public void setEntityList(EntityRecognizerEntityList entityList) {
        this.entityList = entityList;
    }

    /**
     * <p>
     * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     * </p>
     * 
     * @return The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     */

    public EntityRecognizerEntityList getEntityList() {
        return this.entityList;
    }

    /**
     * <p>
     * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     * </p>
     * 
     * @param entityList
     *        The S3 location of the CSV file that has the entity list for your custom entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityList(EntityRecognizerEntityList entityList) {
        setEntityList(entityList);
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @return A list of augmented manifest files that provide training data for your custom model. An augmented
     *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     */

    public java.util.List<AugmentedManifestsListItem> getAugmentedManifests() {
        return augmentedManifests;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     */

    public void setAugmentedManifests(java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        if (augmentedManifests == null) {
            this.augmentedManifests = null;
            return;
        }

        this.augmentedManifests = new java.util.ArrayList<AugmentedManifestsListItem>(augmentedManifests);
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAugmentedManifests(java.util.Collection)} or {@link #withAugmentedManifests(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withAugmentedManifests(AugmentedManifestsListItem... augmentedManifests) {
        if (this.augmentedManifests == null) {
            setAugmentedManifests(new java.util.ArrayList<AugmentedManifestsListItem>(augmentedManifests.length));
        }
        for (AugmentedManifestsListItem ele : augmentedManifests) {
            this.augmentedManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withAugmentedManifests(java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        setAugmentedManifests(augmentedManifests);
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
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getAnnotations() != null)
            sb.append("Annotations: ").append(getAnnotations()).append(",");
        if (getEntityList() != null)
            sb.append("EntityList: ").append(getEntityList()).append(",");
        if (getAugmentedManifests() != null)
            sb.append("AugmentedManifests: ").append(getAugmentedManifests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerInputDataConfig == false)
            return false;
        EntityRecognizerInputDataConfig other = (EntityRecognizerInputDataConfig) obj;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getAnnotations() == null ^ this.getAnnotations() == null)
            return false;
        if (other.getAnnotations() != null && other.getAnnotations().equals(this.getAnnotations()) == false)
            return false;
        if (other.getEntityList() == null ^ this.getEntityList() == null)
            return false;
        if (other.getEntityList() != null && other.getEntityList().equals(this.getEntityList()) == false)
            return false;
        if (other.getAugmentedManifests() == null ^ this.getAugmentedManifests() == null)
            return false;
        if (other.getAugmentedManifests() != null && other.getAugmentedManifests().equals(this.getAugmentedManifests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getAnnotations() == null) ? 0 : getAnnotations().hashCode());
        hashCode = prime * hashCode + ((getEntityList() == null) ? 0 : getEntityList().hashCode());
        hashCode = prime * hashCode + ((getAugmentedManifests() == null) ? 0 : getAugmentedManifests().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerInputDataConfig clone() {
        try {
            return (EntityRecognizerInputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerInputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
