package org.swisspush.reststorage;

import io.vertx.core.Vertx;
import org.slf4j.LoggerFactory;

/**
 * Created by florian kammermann on 23.05.2016.
 *
 * Deploys the rest-storage to vert.x.
 * Used in the standalone scenario.
 */
public class FileSystemRestStorageRunner {

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new RestStorageMod(), event ->
                LoggerFactory.getLogger(FileSystemRestStorageRunner.class).info("rest-storage started"));
    }
}
