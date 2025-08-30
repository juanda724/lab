package com.example.CacheLRU;

import java.util.LinkedHashMap;
import java.util.Map;



public class CacheLRU<K, V> {
        private final int capacity;
        final LinkedHashMap<K, V> cache;

        public CacheLRU(int capacity) {
            this.capacity = capacity;
            this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                    return size() > CacheLRU.this.capacity;
                }
            };
        }

        public synchronized V get(K key) {
            return cache.get(key);
        }

        public synchronized void put(K key, V value) {
            cache.put(key, value);
        }

        public synchronized boolean containsKey(K key) {
            return cache.containsKey(key);
        }

        public synchronized int size() {
            return cache.size();
        }

}

