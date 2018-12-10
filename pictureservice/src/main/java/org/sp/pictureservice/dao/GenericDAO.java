package org.sp.pictureservice.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

public abstract class GenericDAO<T> {

	private final String UNIT_NAME = "website_pictureservice";
	
	@PersistenceContext(unitName=UNIT_NAME)
	private EntityManager em = new EntityManager() {
		
		@Override
		public <T> T unwrap(Class<T> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void setProperty(String arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFlushMode(FlushModeType arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void remove(Object arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void refresh(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void refresh(Object arg0, LockModeType arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void refresh(Object arg0, Map<String, Object> arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void refresh(Object arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void persist(Object arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public <T> T merge(T arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void lock(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lock(Object arg0, LockModeType arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void joinTransaction() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean isOpen() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isJoinedToTransaction() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public EntityTransaction getTransaction() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T getReference(Class<T> arg0, Object arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map<String, Object> getProperties() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Metamodel getMetamodel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public LockModeType getLockMode(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public FlushModeType getFlushMode() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EntityManagerFactory getEntityManagerFactory() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EntityGraph<?> getEntityGraph(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getDelegate() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public CriteriaBuilder getCriteriaBuilder() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2, Map<String, Object> arg3) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T find(Class<T> arg0, Object arg1, Map<String, Object> arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T find(Class<T> arg0, Object arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void detach(Object arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public StoredProcedureQuery createStoredProcedureQuery(String arg0, String... arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public StoredProcedureQuery createStoredProcedureQuery(String arg0, Class... arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public StoredProcedureQuery createStoredProcedureQuery(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> TypedQuery<T> createQuery(String arg0, Class<T> arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createQuery(CriteriaDelete arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createQuery(CriteriaUpdate arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> TypedQuery<T> createQuery(CriteriaQuery<T> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createQuery(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createNativeQuery(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createNativeQuery(String arg0, Class arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createNativeQuery(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public StoredProcedureQuery createNamedStoredProcedureQuery(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> TypedQuery<T> createNamedQuery(String arg0, Class<T> arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Query createNamedQuery(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EntityGraph<?> createEntityGraph(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> EntityGraph<T> createEntityGraph(Class<T> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private Class<T> entityClass;
	
	public GenericDAO(){}
	
	public GenericDAO(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	public void save(T entity){
		this.em.persist(entity);
	}
	
	public T update(T entity){
		return em.merge(entity);
	}
	
	protected boolean delete(Object id, Class<T> classe){
		T entityToBeRemoved = em.getReference(classe, id);
		try {
			em.remove(entityToBeRemoved);
			return true;
		} catch (Exception e){
			System.out.println("Fehler beim Speichern der Id: "+id.toString());
			return false;
		}
	}
	
	public T find(int entityId) {
		return em.find(entityClass, entityId);
	}
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public List<T> findAll(){
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return em.createQuery(cq).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	protected T findOneResult (String namedQuery, Map<String, Object> parameters){
		T result = null;
		try {
			Query query = em.createNamedQuery(namedQuery);
			if (parameters != null && !parameters.isEmpty()){
				populateQueryParameters(query, parameters);
			}
			
			result = (T) query.getSingleResult();
					
		} catch (Exception e){
			System.out.println("Fehler bei der Query: "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	private void populateQueryParameters(Query query, Map<String, Object> parameters){
		for (Entry<String, Object> entry : parameters.entrySet()){
			query.setParameter(entry.getKey(),  entry.getValue());
		}
	}
	
	
}
