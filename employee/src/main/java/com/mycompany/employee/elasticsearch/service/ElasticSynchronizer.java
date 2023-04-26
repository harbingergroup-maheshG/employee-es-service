//package com.mycompany.employee.elasticsearch.service;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//import javax.transaction.Transactional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//public class ElasticSynchronizer {
//	
//	private static final Logger LOGGER = LoggerFactory.getLogger(ElasticSynchronizer.class);
//
//    // Fields
//
//    // Constructor
//
//    @Scheduled(cron = "0 */3 * * * *")
//    @Transactional
//    public void sync() {
//    	LOGGER.info("Start Syncing - {}", LocalDateTime.now());
//        this.syncUsers();
//        LOGGER.info(" End Syncing - {}", LocalDateTime.now());
//    }
//
//    private void syncUsers() {
//    }
//
//    private static Predicate getModificationDatePredicate(CriteriaBuilder cb, Root<?> root) {
//    	return null;
//    }
//}
