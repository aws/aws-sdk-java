/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper.FailedBatch;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.s3.model.Region;

import java.util.List;
import java.util.Map;

/**
 * Interface for DynamoDBMapper.
 *
 * <p>
 * <b>Note:</b> Do not implement this interface, extend from {@link AbstractDynamoDBMapper} instead.
 * </p>
 *
 * @see DynamoDBMapper
 * @see AbstractDynamoDBMapper
 */
public interface IDynamoDBMapper {
    /**
     * Get the table model for the class, using the default configuration.
     *
     * @see DynamoDBMapper#getTableModel(Class, DynamoDBMapperConfig)
     */
    <T extends Object> DynamoDBMapperTableModel<T> getTableModel(Class<T> clazz);

    /**
     * Get the table model for the class using the provided configuration override.
     */
    <T extends Object> DynamoDBMapperTableModel<T> getTableModel(Class<T> clazz, DynamoDBMapperConfig config);

    /**
     * Loads an object with the hash key given and a configuration override. This configuration
     * overrides the default provided at object construction.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    <T extends Object> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config);

    /**
     * Loads an object with the hash key given, using the default configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    <T extends Object> T load(Class<T> clazz, Object hashKey);

    /**
     * Loads an object with a hash and range key, using the default configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey);

    /**
     * Returns an object whose keys match those of the prototype key object given, or null if no
     * such item exists.
     *
     * @param keyObject
     *            An object of the class to load with the keys values to match.
     * @see DynamoDBMapper#load(Object, DynamoDBMapperConfig)
     */
    <T extends Object> T load(T keyObject);

    /**
     * Returns an object whose keys match those of the prototype key object given, or null if no
     * such item exists.
     *
     * @param keyObject
     *            An object of the class to load with the keys values to match.
     * @param config
     *            Configuration for the service call to retrieve the object from DynamoDB. This
     *            configuration overrides the default given at construction.
     */
    <T extends Object> T load(T keyObject, DynamoDBMapperConfig config);

    /**
     * Returns an object with the given hash key, or null if no such object exists.
     *
     * @param clazz
     *            The class to load, corresponding to a DynamoDB table.
     * @param hashKey
     *            The key of the object.
     * @param rangeKey
     *            The range key of the object, or null for tables without a range key.
     * @param config
     *            Configuration for the service call to retrieve the object from DynamoDB. This
     *            configuration overrides the default given at construction.
     */
    <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config);

    /**
     * Creates and fills in the attributes on an instance of the class given with the attributes
     * given.
     * <p>
     * This is accomplished by looking for getter methods annotated with an appropriate annotation,
     * then looking for matching attribute names in the item attribute map.
     * <p>
     * This method is no longer called by load/scan/query methods. If you are overriding this
     * method, please switch to using an AttributeTransformer
     *
     * @param clazz
     *            The class to instantiate and hydrate
     * @param itemAttributes
     *            The set of item attributes, keyed by attribute name.
     */
    <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes);

    /**
     * Unmarshalls the list of item attributes into objects of type clazz.
     * <p>
     * This method is no longer called by load/scan/query methods. If you are overriding this
     * method, please switch to using an AttributeTransformer
     *
     * @see DynamoDBMapper#marshallIntoObject(Class, Map)
     */
    <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes);

    /**
     * Saves the object given into DynamoDB, using the default configuration.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    <T extends Object> void save(T object);

    /**
     * Saves the object given into DynamoDB, using the default configuration and the specified
     * saveExpression.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    <T extends Object> void save(T object, DynamoDBSaveExpression saveExpression);

    /**
     * Saves the object given into DynamoDB, using the specified configuration.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    <T extends Object> void save(T object, DynamoDBMapperConfig config);

    /**
     * Saves an item in DynamoDB. The service method used is determined by the
     * {@link DynamoDBMapperConfig#getSaveBehavior()} value, to use either
     * {@link AmazonDynamoDB#putItem(PutItemRequest)} or
     * {@link AmazonDynamoDB#updateItem(UpdateItemRequest)}:
     * <ul>
     * <li><b>UPDATE</b> (default) : UPDATE will not affect unmodeled attributes on a save operation
     * and a null value for the modeled attribute will remove it from that item in DynamoDB. Because
     * of the limitation of updateItem request, the implementation of UPDATE will send a putItem
     * request when a key-only object is being saved, and it will send another updateItem request if
     * the given key(s) already exists in the table.</li>
     * <li><b>UPDATE_SKIP_NULL_ATTRIBUTES</b> : Similar to UPDATE except that it ignores any null
     * value attribute(s) and will NOT remove them from that item in DynamoDB. It also guarantees to
     * send only one single updateItem request, no matter the object is key-only or not.</li>
     * <li><b>CLOBBER</b> : CLOBBER will clear and replace all attributes, included unmodeled ones,
     * (delete and recreate) on save. Versioned field constraints will also be disregarded.</li>
     * </ul>
     * Any options specified in the saveExpression parameter will be overlaid on any constraints due
     * to versioned attributes.
     *
     * @param object
     *            The object to save into DynamoDB
     * @param saveExpression
     *            The options to apply to this save request
     * @param config
     *            The configuration to use, which overrides the default provided at object
     *            construction.
     * @see DynamoDBMapperConfig.SaveBehavior
     */
    <T extends Object> void save(T object, DynamoDBSaveExpression saveExpression, DynamoDBMapperConfig config);

    /**
     * Deletes the given object from its DynamoDB table using the default configuration.
     */
    void delete(Object object);

    /**
     * Deletes the given object from its DynamoDB table using the specified deleteExpression and
     * default configuration.
     */
    void delete(Object object, DynamoDBDeleteExpression deleteExpression);

    /**
     * Deletes the given object from its DynamoDB table using the specified configuration.
     */
    void delete(Object object, DynamoDBMapperConfig config);

    /**
     * Deletes the given object from its DynamoDB table using the provided deleteExpression and
     * provided configuration. Any options specified in the deleteExpression parameter will be
     * overlaid on any constraints due to versioned attributes.
     *
     * @param deleteExpression
     *            The options to apply to this delete request
     * @param config
     *            Config override object. If {@link SaveBehavior#CLOBBER} is supplied, version
     *            fields will not be considered when deleting the object.
     */
    <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config);

    /**
     * Transactionally writes objects specified by transactionWriteRequest by calling {@link AmazonDynamoDB#transactWriteItems(TransactWriteItemsRequest)} API.
     * Changes to objects which are put or updated are applied in-memory. <b>Such in-memory updates are NOT thread safe.</b>
     * <p>
     * <b>This method ignores any SaveBehavior set on the mapper. Whether an object is put or updated is solely determined by the
     * {@link TransactionWriteRequest} method called by user while constructing request object. Furthermore, put and update work
     * as if SaveBehavior is set as CLOBBER.</b>
     * </p>
     * <p>
     * <b>This method does not support versioning annotations. It throws {@link com.amazonaws.SdkClientException} exception if
     * class of any input object is annotated with {@link DynamoDBVersionAttribute} or {@link DynamoDBVersioned}</b>
     * </p>
     * <p>
     * Any exceptions from underlying API are thrown as is. For more information, please refer
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactWriteItems.html
     * </p>
     *
     * @param transactionWriteRequest
     *              Specifies objects to write along with appropriate condition expressions.
     *
     * @see DynamoDBMapper#transactionWrite(TransactionWriteRequest, DynamoDBMapperConfig)
     */
    void transactionWrite(TransactionWriteRequest transactionWriteRequest);

    /**
     * Transactionally writes objects specified by transactionWriteRequest by calling {@link AmazonDynamoDB#transactWriteItems(TransactWriteItemsRequest)} API.
     * Changes to objects which are put or updated are applied in-memory. <b>Such in-memory updates are NOT thread safe.</b>
     * <p>
     * <b>This method ignores any SaveBehavior set on the mapper. Whether an object is put or updated is solely determined by the
     * {@link TransactionWriteRequest} method called by user while constructing request object. Furthermore, put and update work
     * as if SaveBehavior is set as CLOBBER.</b>
     * </p>
     * <p>
     * <b>This method does not support versioning annotations. It throws {@link com.amazonaws.SdkClientException} exception if
     * class of any input object is annotated with {@link DynamoDBVersionAttribute} or {@link DynamoDBVersioned}</b>
     * </p>
     * <p>
     * Any exceptions from underlying API are thrown as is. For more information, please refer
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactWriteItems.html
     * </p>
     *
     * @param transactionWriteRequest
     *              Specifies objects to write along with appropriate condition expressions.
     * @param config
     *              Only {@link DynamoDBMapperConfig#getTableNameOverride()}, {@link DynamoDBMapperConfig#getTableNameResolver()},
     *              {@link DynamoDBMapperConfig#getObjectTableNameResolver()} and {@link DynamoDBMapperConfig#getTypeConverterFactory()}
     *              are considered.
     *              If {@link DynamoDBMapperConfig.TableNameOverride} is specified then, given table override will be used as table name for all input objects.
     *
     * @see DynamoDBMapper#transactionWrite(TransactionWriteRequest, DynamoDBMapperConfig)
     */
    void transactionWrite(TransactionWriteRequest transactionWriteRequest, DynamoDBMapperConfig config);

    /**
     * Transactionally loads objects specified by transactionLoadRequest by calling {@link AmazonDynamoDB#transactGetItems(TransactGetItemsRequest)} API.
     * <p>
     * Any exceptions from underlying API are thrown as is. For more information, please refer
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactGetItems.html
     * </p>
     *
     * @param transactionLoadRequest
     *              Specifies objects to load along with appropriate projection expressions.
     *
     * @see DynamoDBMapper#transactionLoad(TransactionLoadRequest, DynamoDBMapperConfig)
     */
    List<Object> transactionLoad(TransactionLoadRequest transactionLoadRequest);

    /**
     * Transactionally loads objects specified by transactionLoadRequest by calling {@link AmazonDynamoDB#transactGetItems(TransactGetItemsRequest)} API.
     * <p>
     * Any exceptions from underlying API are thrown as is. For more information, please refer
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactGetItems.html
     * </p>
     *
     * @param transactionLoadRequest
     *              Specifies objects to load along with appropriate projection expressions.
     * @param config
     *              Only {@link DynamoDBMapperConfig#getTableNameOverride()}, {@link DynamoDBMapperConfig#getTableNameResolver()},
     *              {@link DynamoDBMapperConfig#getObjectTableNameResolver()} and {@link DynamoDBMapperConfig#getTypeConverterFactory()}
     *              are supported.
     *              If {@link DynamoDBMapperConfig.TableNameOverride} is specified then, given table override will be used as table name for all input objects.
     *
     * @see DynamoDBMapper#transactionLoad(TransactionLoadRequest, DynamoDBMapperConfig)
     */
    List<Object> transactionLoad(TransactionLoadRequest transactionLoadRequest, DynamoDBMapperConfig config);

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No version checks are
     * performed</b>, as required by the API.
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable)
     */
    List<FailedBatch> batchDelete(Iterable<? extends Object> objectsToDelete);

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No version checks are
     * performed</b>, as required by the API.
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable)
     */
    List<FailedBatch> batchDelete(Object... objectsToDelete);

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No version checks are
     * performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and always behaves as if
     * SaveBehavior.CLOBBER was specified, as the AmazonDynamoDB.batchWriteItem() request does not
     * support updating existing items.
     * <p>
     * This method fails to save the batch if the size of an individual object in the batch exceeds
     * 400 KB. For more information on batch restrictions see, http://docs.aws.amazon
     * .com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
     * </p>
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable)
     */
    List<FailedBatch> batchSave(Iterable<? extends Object> objectsToSave);

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No version checks are
     * performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and always behaves as if
     * SaveBehavior.CLOBBER was specified, as the AmazonDynamoDB.batchWriteItem() request does not
     * support updating existing items. *
     * <p>
     * This method fails to save the batch if the size of an individual object in the batch exceeds
     * 400 KB. For more information on batch restrictions see, http://docs.aws.amazon
     * .com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
     * </p>
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable)
     */
    List<FailedBatch> batchSave(Object... objectsToSave);

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No version checks are
     * performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and always behaves as if
     * SaveBehavior.CLOBBER was specified, as the AmazonDynamoDB.batchWriteItem() request does not
     * support updating existing items.
     * <p>
     * This method fails to save the batch if the size of an individual object in the batch exceeds
     * 400 KB. For more information on batch restrictions see, http://docs.aws.amazon
     * .com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
     * </p>
     * <p>
     * If one of the write requests is for a table that is not present, this method does not throw a
     * ResourceNotFoundException but returns a FailedBatch which includes this exception and the
     * unprocessed items.
     * </p>
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable)
     */
    List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite, Iterable<? extends Object> objectsToDelete);

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. Use mapper config to
     * control the retry strategy when UnprocessedItems are returned by the BatchWriteItem API
     * <p>
     * This method fails to save the batch if the size of an individual object in the batch exceeds
     * 400 KB. For more information on batch restrictions see, http://docs.aws.amazon
     * .com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html
     * </p>
     * <p>
     * If one of the write requests is for a table that is not present, this method does not throw a
     * ResourceNotFoundException but returns a FailedBatch which includes this exception and the
     * unprocessed items.
     * </p>
     *
     * @param objectsToWrite
     *            A list of objects to save to DynamoDB. <b>No version checks are performed</b>, as
     *            required by the {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     * @param objectsToDelete
     *            A list of objects to delete from DynamoDB. <b>No version checks are performed</b>,
     *            as required by the {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} and
     *            {@link DynamoDBMapperConfig#getBatchWriteRetryStrategy()} are considered. If
     *            TableNameOverride is specified, all objects in the two parameter lists will be
     *            considered to belong to the given table override. In particular, this method
     *            <b>always acts as if SaveBehavior.CLOBBER was specified</b> regardless of the
     *            value of the config parameter.
     * @return A list of failed batches which includes the unprocessed items and the exceptions
     *         causing the failure.
     * @see DynamoDBMapperConfig#getTableNameOverride()
     * @see DynamoDBMapperConfig#getBatchWriteRetryStrategy()
     */
    List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                 Iterable<? extends Object> objectsToDelete,
                                 DynamoDBMapperConfig config);

    /**
     * Retrieves multiple items from multiple tables using their primary keys.
     *
     * @see DynamoDBMapper#batchLoad(List, DynamoDBMapperConfig)
     * @return A map of the loaded objects. Each key in the map is the name of a DynamoDB table.
     *         Each value in the map is a list of objects that have been loaded from that table. All
     *         objects for each table can be cast to the associated user defined type that is
     *         annotated as mapping that table.
     * @throws DynamoDBMapper.BatchGetItemException if all the requested items are not processed
     *         within the maximum number of retries.
     */
    Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet);

    /**
     * Retrieves multiple items from multiple tables using their primary keys.
     *
     * @param itemsToGet
     *            Key objects, corresponding to the class to fetch, with their primary key values
     *            set.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} and
     *            {@link DynamoDBMapperConfig#getConsistentReads()} are considered.
     * @return A map of the loaded objects. Each key in the map is the name of a DynamoDB table.
     *         Each value in the map is a list of objects that have been loaded from that table. All
     *         objects for each table can be cast to the associated user defined type that is
     *         annotated as mapping that table.
     * @throws DynamoDBMapper.BatchGetItemException if all the requested items are not processed
     *         within the maximum number of retries.
     */
    Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet, DynamoDBMapperConfig config);

    /**
     * Retrieves the attributes for multiple items from multiple tables using their primary keys.
     * {@link AmazonDynamoDB#batchGetItem(BatchGetItemRequest)} API.
     *
     * @return A map of the loaded objects. Each key in the map is the name of a DynamoDB table.
     *         Each value in the map is a list of objects that have been loaded from that table. All
     *         objects for each table can be cast to the associated user defined type that is
     *         annotated as mapping that table.
     * @throws DynamoDBMapper.BatchGetItemException if all the requested items are not processed
     *         within the maximum number of retries.
     * @see #batchLoad(List, DynamoDBMapperConfig)
     * @see #batchLoad(Map, DynamoDBMapperConfig)
     */
    Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet);

    /**
     * Retrieves multiple items from multiple tables using their primary keys. Valid only for tables
     * with a single hash key, or a single hash and range key. For other schemas, use
     * {@link DynamoDBMapper#batchLoad(List, DynamoDBMapperConfig)}
     *
     * @param itemsToGet
     *            Map from class to load to list of primary key attributes.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} and
     *            {@link DynamoDBMapperConfig#getConsistentReads()} are considered.
     * @return A map of the loaded objects. Each key in the map is the name of a DynamoDB table.
     *         Each value in the map is a list of objects that have been loaded from that table. All
     *         objects for each table can be cast to the associated user defined type that is
     *         annotated as mapping that table.
     * @throws DynamoDBMapper.BatchGetItemException if all the requested items are not processed
     *         within the maximum number of retries.
     */
    Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config);

    /**
     * Scans through an Amazon DynamoDB table and returns the matching results as an unmodifiable
     * list of instantiated objects, using the default configuration.
     *
     * @see DynamoDBMapper#scan(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression);

    /**
     * Scans through an Amazon DynamoDB table and returns the matching results as an unmodifiable
     * list of instantiated objects. The table to scan is determined by looking at the annotations
     * on the specified class, which declares where to store the object data in Amazon DynamoDB, and
     * the scan expression parameter allows the caller to filter results and control how the scan is
     * executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any attempts to modify
     * the list will result in an UnsupportedOperationException.
     * <p>
     * You can specify the pagination loading strategy for this scan operation. By default, the list
     * returned is lazily loaded when possible.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how to store the object
     *            data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply to limit results.
     * @param config
     *            The configuration to use for this scan, which overrides the default provided at
     *            object construction.
     * @return An unmodifiable list of the objects constructed from the results of the scan
     *         operation.
     * @see PaginatedScanList
     * @see PaginationLoadingStrategy
     */
    <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config);

    /**
     * Scans through an Amazon DynamoDB table on logically partitioned segments in parallel and
     * returns the matching results in one unmodifiable list of instantiated objects, using the
     * default configuration.
     *
     * @see DynamoDBMapper#parallelScan(Class, DynamoDBScanExpression,int, DynamoDBMapperConfig)
     */
    <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                  DynamoDBScanExpression scanExpression,
                                                  int totalSegments);

    /**
     * Scans through an Amazon DynamoDB table on logically partitioned segments in parallel. This
     * method will create a thread pool of the specified size, and each thread will issue scan
     * requests for its assigned segment, following the returned continuation token, until the end
     * of its segment. Callers should be responsible for setting the appropriate number of total
     * segments. More scan segments would result in better performance but more consumed capacity of
     * the table. The results are returned in one unmodifiable list of instantiated objects. The
     * table to scan is determined by looking at the annotations on the specified class, which
     * declares where to store the object data in Amazon DynamoDB, and the scan expression parameter
     * allows the caller to filter results and control how the scan is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any attempts to modify
     * the list will result in an UnsupportedOperationException.
     * <p>
     * You can specify the pagination loading strategy for this parallel scan operation. By default,
     * the list returned is lazily loaded when possible.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how to store the object
     *            data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply to limit results.
     * @param totalSegments
     *            Number of total parallel scan segments. <b>Range: </b>1 - 4096
     * @param config
     *            The configuration to use for this scan, which overrides the default provided at
     *            object construction.
     * @return An unmodifiable list of the objects constructed from the results of the scan
     *         operation.
     * @see PaginatedParallelScanList
     * @see PaginationLoadingStrategy
     */
    <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                  DynamoDBScanExpression scanExpression,
                                                  int totalSegments,
                                                  DynamoDBMapperConfig config);

    /**
     * Scans through an Amazon DynamoDB table and returns a single page of matching results. The
     * table to scan is determined by looking at the annotations on the specified class, which
     * declares where to store the object data in AWS DynamoDB, and the scan expression parameter
     * allows the caller to filter results and control how the scan is executed.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how to store the object
     *            data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply to limit results.
     * @param config
     *            The configuration to use for this scan, which overrides the default provided at
     *            object construction.
     */
    <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config);

    /**
     * Scans through an Amazon DynamoDB table and returns a single page of matching results.
     *
     * @see DynamoDBMapper#scanPage(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression);

    /**
     * Queries an Amazon DynamoDB table and returns the matching results as an unmodifiable list of
     * instantiated objects, using the default configuration.
     *
     * @see DynamoDBMapper#query(Class, DynamoDBQueryExpression, DynamoDBMapperConfig)
     */
    <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression);

    /**
     * Queries an Amazon DynamoDB table and returns the matching results as an unmodifiable list of
     * instantiated objects. The table to query is determined by looking at the annotations on the
     * specified class, which declares where to store the object data in Amazon DynamoDB, and the
     * query expression parameter allows the caller to filter results and control how the query is
     * executed.
     * <p>
     * When the query is on any local/global secondary index, callers should be aware that the
     * returned object(s) will only contain item attributes that are projected into the index. All
     * the other unprojected attributes will be saved as type default values.
     * <p>
     * Callers should also be aware that the returned list is unmodifiable, and any attempts to
     * modify the list will result in an UnsupportedOperationException.
     * <p>
     * You can specify the pagination loading strategy for this query operation. By default, the
     * list returned is lazily loaded when possible.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how to store the object
     *            data in Amazon DynamoDB.
     * @param queryExpression
     *            Details on how to run the query, including any conditions on the key values
     * @param config
     *            The configuration to use for this query, which overrides the default provided at
     *            object construction.
     * @return An unmodifiable list of the objects constructed from the results of the query
     *         operation.
     * @see PaginatedQueryList
     * @see PaginationLoadingStrategy
     */
    <T> PaginatedQueryList<T> query(Class<T> clazz,
                                    DynamoDBQueryExpression<T> queryExpression,
                                    DynamoDBMapperConfig config);

    /**
     * Queries an Amazon DynamoDB table and returns a single page of matching results. The table to
     * query is determined by looking at the annotations on the specified class, which declares
     * where to store the object data in Amazon DynamoDB, and the query expression parameter allows
     * the caller to filter results and control how the query is executed.
     *
     * @see DynamoDBMapper#queryPage(Class, DynamoDBQueryExpression, DynamoDBMapperConfig)
     */
    <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression);

    /**
     * Queries an Amazon DynamoDB table and returns a single page of matching results. The table to
     * query is determined by looking at the annotations on the specified class, which declares
     * where to store the object data in Amazon DynamoDB, and the query expression parameter allows
     * the caller to filter results and control how the query is executed.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how to store the object
     *            data in AWS DynamoDB.
     * @param queryExpression
     *            Details on how to run the query, including any conditions on the key values
     * @param config
     *            The configuration to use for this query, which overrides the default provided at
     *            object construction.
     */
    <T> QueryResultPage<T> queryPage(Class<T> clazz,
                                     DynamoDBQueryExpression<T> queryExpression,
                                     DynamoDBMapperConfig config);

    /**
     * Evaluates the specified scan expression and returns the count of matching items, without
     * returning any of the actual item data, using the default configuration.
     *
     * @see DynamoDBMapper#count(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    int count(Class<?> clazz, DynamoDBScanExpression scanExpression);

    /**
     * Evaluates the specified scan expression and returns the count of matching items, without
     * returning any of the actual item data.
     * <p>
     * This operation will scan your entire table, and can therefore be very expensive. Use with
     * caution.
     *
     * @param clazz
     *            The class mapped to a DynamoDB table.
     * @param scanExpression
     *            The parameters for running the scan.
     * @param config
     *            The configuration to use for this scan, which overrides the default provided at
     *            object construction.
     * @return The count of matching items, without returning any of the actual item data.
     */
    int count(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config);

    /**
     * Evaluates the specified query expression and returns the count of matching items, without
     * returning any of the actual item data, using the default configuration.
     *
     * @see DynamoDBMapper#count(Class, DynamoDBQueryExpression, DynamoDBMapperConfig)
     */
    <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression);

    /**
     * Evaluates the specified query expression and returns the count of matching items, without
     * returning any of the actual item data.
     *
     * @param clazz
     *            The class mapped to a DynamoDB table.
     * @param queryExpression
     *            The parameters for running the scan.
     * @param config
     *            The mapper configuration to use for the query, which overrides the default
     *            provided at object construction.
     * @return The count of matching items, without returning any of the actual item data.
     */
    <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config);

    /**
     * Returns the underlying {@link S3ClientCache} for accessing S3.
     */
    S3ClientCache getS3ClientCache();

    /**
     * Creates an S3Link with the specified bucket name and key using the default S3 region. This
     * method requires the mapper to have been initialized with the necessary credentials for
     * accessing S3.
     *
     * @throws IllegalStateException
     *             if the mapper has not been constructed with the necessary S3 AWS credentials.
     */
    S3Link createS3Link(String bucketName, String key);

    /**
     * Creates an S3Link with the specified region, bucket name and key. This method requires the
     * mapper to have been initialized with the necessary credentials for accessing S3.
     *
     * @throws IllegalStateException
     *             if the mapper has not been constructed with the necessary S3 AWS credentials.
     */
    S3Link createS3Link(Region s3region, String bucketName, String key);

    /**
     * Creates an S3Link with the specified region, bucket name and key. This method requires the
     * mapper to have been initialized with the necessary credentials for accessing S3.
     *
     * @throws IllegalStateException
     *             if the mapper has not been constructed with the necessary S3 AWS credentials.
     */
    S3Link createS3Link(String s3region, String bucketName, String key);

    /**
     * Parse the given POJO class and return the CreateTableRequest for the DynamoDB table it
     * represents. Note that the returned request does not include the required
     * ProvisionedThroughput parameters for the primary table and the GSIs, and that all secondary
     * indexes are initialized with the default projection type - KEY_ONLY.
     */
    CreateTableRequest generateCreateTableRequest(Class<?> clazz);


    /**
     * Parse the given POJO class and return the DeleteTableRequest for the DynamoDB table it
     * represents.
     */
    DeleteTableRequest generateDeleteTableRequest(Class<?> clazz);

}
